package it.unical.asde2018.slot_machine.components.services;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.components.models.User;

@Service
public class SlotMachineService {

	HashMap<String, User> users;
	HashMap<String, Integer> userCoins;

	@PostConstruct
	private void init() {
		users = new HashMap<String, User>();
		userCoins = new HashMap<String, Integer>();
		users.put("Ciccio", new User("Ciccio"));
		userCoins.put("Ciccio", 200);

	}

	public User getUser(String username) {

		return users.get(username);
	}

	public int getCoins(String username) {
		return userCoins.get(username);
	}

	public void setCoins(String username, int coins) {
		userCoins.put(username, coins);
	}

	public int[] play(String username, int bet) {
		decrementCoins(username,bet);
		int numbers[] = { 0, 0, 0 };
		numbers[0] = runSlotMachine();
		numbers[1] = runSlotMachine();
		numbers[2] = runSlotMachine();
		return numbers;
	}

	private void decrementCoins(String username, int bet) {
	int coins=	userCoins.get(username);
		setCoins(username, coins-bet);
	}

	private int runSlotMachine() {
		return (int) (Math.random() * 3);
	}

	public void addWin(String username, int bet) {
		int coins = getCoins(username);
		coins += bet * 9;
		setCoins(username, coins);

	}

}
