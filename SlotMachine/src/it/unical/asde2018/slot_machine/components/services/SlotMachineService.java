package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {

	public static final int STARTING_COINS = 200;
	private int coins;
	
	@PostConstruct
	public void init() {
		this.coins = STARTING_COINS;
	}
	
	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		if(coins > STARTING_COINS)
			this.coins = STARTING_COINS;
		else
			this.coins = coins;
	}

	public int[] generateNumbers() {
		int values[] = new int[3];
		for (int i = 0; i < values.length; i++) {
			values[i] = getRandomNumber();
		}
		return values;
	}
	
	public boolean bet(int coins, int [] values) {
		this.coins -= coins;
		if(values[0] == values[1] && values[0] == values[2]) {
			this.coins += coins * 9;
			return true;			
		}
		return false;		
	}
	
	private int getRandomNumber() {
		return new Random().nextInt(3);
	}
}
