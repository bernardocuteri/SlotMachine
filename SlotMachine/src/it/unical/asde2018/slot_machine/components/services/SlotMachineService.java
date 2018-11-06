package it.unical.asde2018.slot_machine.components.services;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.NumberGen;

@Service
public class SlotMachineService {

	private int coins;
	private NumberGen number;
	
	
	@PostConstruct
	public void init() {
		coins = 200;
		number = new NumberGen();
	}
	
	public void generateNumber() {
		number.generateNumber();
	}
	
	public NumberGen getGeneratedNumber() {
		return number;
	}
	
	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	
	public boolean equalNumber() {
		if(number.getN1()==number.getN2() && number.getN2()==number.getN3() && number.getN1()==number.getN3())
			return true;
		return false;
	}
	
	
	
}
