package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import it.unical.asde2018.slot_machine.entity.Credentials;

@Service
public class LogInService
{
	private List<Credentials> users;
	
	@PostConstruct
	public void init()
	{
		this.users = new ArrayList<>();
		users.add(new Credentials("dexter", "ciufforosso"));
		users.add(new Credentials("eddie", "wearevenom"));
		users.add(new Credentials("doc","grandegiove"));
	}
	
	public boolean login(String username, String password) {
		return users.contains(new Credentials(username, password));
	}

	public List<Credentials> getUsers() {
		return users;
	}
	
}
