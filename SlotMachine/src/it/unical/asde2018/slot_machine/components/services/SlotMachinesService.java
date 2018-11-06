package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SlotMachinesService {
	private int coins;
	private String status;

	@PostConstruct
	private void init() {
		coins = 200;
		status = "null";
	}

	public List<Integer> play(int bet) {
		List<Integer> result = new ArrayList<>();
		this.coins -= bet;
		status = "null";
		int firstNumber = new Random().nextInt(2);
		int secondNumber = new Random().nextInt(2);
		int thirdNumber = new Random().nextInt(2);
		result.add(firstNumber);
		result.add(secondNumber);
		result.add(thirdNumber);
		if (firstNumber == secondNumber && firstNumber == thirdNumber) {
			this.coins += (bet * 9);
			this.status = "WIN";
		} else
			this.status = "LOSE";
		return result;
	}

	public int getCoins() {
		return coins;
	}

	public String getStatus() {
		return status;
	}

	public void newGame() {
		coins = 200;
		status = "null";
	}
}
