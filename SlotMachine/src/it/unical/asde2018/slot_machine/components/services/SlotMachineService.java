package it.unical.asde2018.slot_machine.components.services;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.User;


@Service
public class SlotMachineService {
	
	private User user;
	
	@PostConstruct
	public void init() {
		setUser(new User("alex",200));
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public int howMuchCoins() {		
		return user.getCoins();
	}

	public boolean canBet(int bet) {
		if(user.getCoins()>= bet)
			return true;
		return false;
		
	}


}
