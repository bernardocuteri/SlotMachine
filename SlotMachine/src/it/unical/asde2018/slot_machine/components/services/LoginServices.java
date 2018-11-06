package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Credential;
import it.unical.asde2018.slot_machine.model.Player;



@Service
public class LoginServices {
	public Set<Credential> users = new HashSet<>();

	@PostConstruct
	public void init() {
		users.add(new Credential("a@a.com", "aaaa",new Player("User1")));
		users.add(new Credential("b@b.com", "bbbb",new Player("User2")));
		users.add(new Credential("c@c.com", "cccc",new Player("User3")));

	}

	public Player login(String email, String password) {
		
		for (Iterator<Credential> it = users.iterator(); it.hasNext(); ) {
	        Credential f = it.next();
	        if (f.equals((new Credential(email, password))))
	            return f.getPlayer();
	    }
		
		
		return null;
	}

}
