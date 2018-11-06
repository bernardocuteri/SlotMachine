package it.unical.asde2018.slot_machine.components.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.entity.Triple;
import it.unical.asde2018.slot_machine.entity.User;

@Service
public class SlotMachineService
{
	private List<User> loggedUsers;
	private Triple triple;

	@PostConstruct
	public void init() {

		this.loggedUsers = new ArrayList<>();
		loggedUsers.add(new User("dexter", 200));
		loggedUsers.add(new User("eddie", 200));
		loggedUsers.add(new User("doc", 200));
		this.triple = new Triple(0, 0, 0);
	}
	

	public Triple getTriple() {
		return triple;
	}


	public boolean winLose() {
		System.out.println(triple.getFirst() + "   " + triple.getSecond() + "    " + triple.getThird());
		return (triple.getFirst() == triple.getSecond() && triple.getSecond() == triple.getThird());

	}
	
	public void setUserCoin (String username, int quantiy)
	{
		for (User u : loggedUsers)
			if (u.getUsername().equals(username))
				u.setCoins(u.getCoins() + quantiy);
	}

	public Triple getATriple() {
		return triple = triple.getAtriple();
	}

	public User getLoggedUsers(String username) {
		for (User u : loggedUsers)
			if (u.getUsername().equals(username))
				return u;
		return null;
	}

}
