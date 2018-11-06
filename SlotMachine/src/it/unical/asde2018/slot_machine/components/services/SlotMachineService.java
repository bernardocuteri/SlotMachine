package it.unical.asde2018.slot_machine.components.services;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.SlotMachine;

@Service
public class SlotMachineService {

	private HashMap<String, Integer> playerCoins;

	public SlotMachine playNewSlotMachine() {
		return new SlotMachine();
	}

	@PostConstruct
	public void initPlayers() {
		playerCoins = new HashMap<>();
		playerCoins.put("ciccio", 200);
	}

	public void beat(int beatChoice, SlotMachine slotMachine, String username) {
		slotMachine.round();
		int coins = getUserCoins(username);
		coins -= beatChoice;
		if (slotMachine.win()) {
			coins += beatChoice * 9;
		}
		playerCoins.put(username, coins);
	}

	public int getUserCoins(String username) {
		return playerCoins.get(username);
	}

}
