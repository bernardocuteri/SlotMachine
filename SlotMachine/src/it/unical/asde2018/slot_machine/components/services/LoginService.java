package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.components.model.Credentials;

@Service
public class LoginService {
	
	public Set<Credentials> users = new HashSet<Credentials>();
	
	@PostConstruct
	public void init() {
		this.users.add(new Credentials("mario", "mario"));
	}
	
	public boolean login(String username, String password) {
		return this.users.contains(new Credentials(username, password));
	}
}