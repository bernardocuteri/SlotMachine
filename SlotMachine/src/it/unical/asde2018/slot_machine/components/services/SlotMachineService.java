package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.domain.Player;

@Service
public class SlotMachineService {

	public void gioca(Player player, int bet) {
		if (win()) {
			player.setCoins(player.getCoins() + bet * 9);
		} else {
			player.setCoins(player.getCoins() - bet);
		}

	}

	private boolean win() {
		Random rand = new Random();
		int n = rand.nextInt(2);
		int n2 = rand.nextInt(2);
		int n3 = rand.nextInt(2);
		return n == n2 && n == n3 && n2 == n3;
	}
}
