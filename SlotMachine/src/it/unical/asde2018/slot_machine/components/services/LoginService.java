package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.User;
import it.unical.asde2018.slot_machine.model.UserGame;

@Service
public class LoginService {
	public Set<User> registeredUsers;

	public User getUser(String username, String password) {
		User user = null;
		for (Iterator<User> it = registeredUsers.iterator(); it.hasNext();) {
			User u = it.next();
			if (u.equals(new User(username, password, UserGame.INITIAL_COINS))) {
				user = u;
				break;
			}
		}
		return user;
	}

	@PostConstruct
	public void init() {
		registeredUsers = new HashSet<>();
		registeredUsers.add(new User("ciccio", "ciccio", UserGame.INITIAL_COINS));
	}

	public boolean login(String username, String password) {
		return registeredUsers.contains(new User(username, password, UserGame.INITIAL_COINS));
	}
}
