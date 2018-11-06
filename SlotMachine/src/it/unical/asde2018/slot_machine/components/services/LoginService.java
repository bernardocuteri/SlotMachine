package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credentials;

@Service
public class LoginService {

	public Set<Credentials> registeredUsers = new HashSet<>();

	@PostConstruct
	public void init() {
		registeredUsers.add(new Credentials("root", "toor"));
		registeredUsers.add(new Credentials("user", "password"));
	}

	public boolean login(String user, String password) {
		return registeredUsers.contains(new Credentials(user, password));
	}
}
