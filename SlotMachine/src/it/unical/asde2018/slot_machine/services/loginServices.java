package it.unical.asde2018.slot_machine.services;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credentials;

@Service
public class loginServices {
	
	public Set<Credentials> registeredUsers = new HashSet<>();
	Credentials user1 = new Credentials("bao", "123");
	
	@PostConstruct
	public void init() {
		registeredUsers.add(user1);
	}
	
	public boolean login(String username, String password) {
		return registeredUsers.contains(new Credentials(username, password));
	}
}
