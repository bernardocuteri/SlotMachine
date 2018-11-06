package it.unical.asde2018.slot_machine.components.services;

import java.util.HashMap;


import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.components.models.Credentials;

@Service
public class LoginService {

	HashMap<String, Credentials> credentials;


	@PostConstruct
	private void init() {
		credentials = new HashMap<String,Credentials>();
		credentials.put("Ciccio",new Credentials("Ciccio", "ciccio1"));
	}

	public boolean loginAccepted(String username, String password) {
		return (credentials.containsKey(username) && 
				credentials.get(username).getPassword().equals(password));
	}

}
