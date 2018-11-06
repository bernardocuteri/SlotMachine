package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credentials;

@Service
public class LoginService {

	private Set<Credentials> registeredUsers;

	@PostConstruct
	public void initRegisteredUsers() {
		registeredUsers = new HashSet<>();
		registeredUsers.add(new Credentials("ciccio", "ciccio"));
	}

	public boolean login(String username, String password) {
		final Credentials credentials = new Credentials(username, password);
		return registeredUsers.contains(credentials);
	}
}
