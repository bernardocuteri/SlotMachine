package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credentials;;

@Service
public class LoginService {

	public Set<Credentials> registeredUsers  = new HashSet<Credentials>();

	@PostConstruct
	public void init() {
		registeredUsers.add(new Credentials("pasquale", "pasquale"));
	}
	
	public boolean login(String username, String password) {
		return registeredUsers.contains(new Credentials(username, password));
	}

}
