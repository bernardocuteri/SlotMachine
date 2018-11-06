package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credentials;


@Service
public class LoginService {
	
	public Set<Credentials> registeredUser = new HashSet<>();
	@PostConstruct
	public void init() {
		registeredUser.add(new Credentials("giro", "lucci"));
	}
	
	 public boolean login(String username, String password) {
		 return registeredUser.contains(new Credentials(username,password));
	 }
}
