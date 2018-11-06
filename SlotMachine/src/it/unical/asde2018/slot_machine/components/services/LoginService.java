package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credential;

@Service
public class LoginService
{
	private Set<Credential> registeredUsers = new HashSet<Credential>();

	@PostConstruct
	public void init()
	{
		getRegisteredUsers().add(new Credential("andrea", "andrea"));
	}

	public boolean login(String username, String password)
	{
		return getRegisteredUsers().contains(new Credential(username, password));
	}

	public Set<Credential> getRegisteredUsers()
	{
		return registeredUsers;
	}
}
