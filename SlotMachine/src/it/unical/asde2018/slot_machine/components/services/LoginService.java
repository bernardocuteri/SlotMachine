package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.domain.Credentials;

@Service
public class LoginService {
	List<Credentials> credentials;

	@PostConstruct
	public void init() {
	
		credentials = new ArrayList<>();
		
		credentials.add(new Credentials("Dennis", "dennis1"));
		credentials.add(new Credentials("pippo", "pluto"));
		
	}
	
	public boolean checkCredentials(String user, String psw) {
		return credentials.contains(new Credentials(user, psw));
	}
	
}
