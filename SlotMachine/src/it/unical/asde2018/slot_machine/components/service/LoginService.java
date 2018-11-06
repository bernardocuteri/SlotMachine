package it.unical.asde2018.slot_machine.components.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credential;

@Service
public class LoginService {
	List<Credential> credentials;


	public boolean check(String user, String pass) {
		return credentials.stream().anyMatch(p->p.getUsername().equals(user) && p.getPassword().equals(pass));
	}


	@PostConstruct
	public void init() {
		credentials=new ArrayList<Credential>();
		credentials.add(new Credential("asd", "asd"));
	}
}
