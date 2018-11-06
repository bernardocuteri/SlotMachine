package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Bet;
import it.unical.asde2018.slot_machine.model.Player;

@Service
public class SlotMachineService {

	public Bet play(Player player, int betAmount) {

		int[] numbers = new int[3];
		numbers[0] = generateRandom();
		numbers[1] = generateRandom();
		numbers[2] = generateRandom();

		Bet bet = new Bet(numbers, false);

		return bet;
	}

	private int generateRandom() {
		Random r = new Random();
		int low = 0;
		int high = 3;
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
