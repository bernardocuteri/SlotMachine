package it.unical.asde2018.slot_machine.model;

import java.util.Random;

public class SlotMachine {

	private int[] slots;
	private int coins;
	private final Random r;

	public SlotMachine() {
		coins = 200;
		r = new Random();
	}

	public void round() {
		for (int i = 0; i < slots.length; ++i) {
			slots[i] = r.nextInt(3);
		}
	}

	public int getCoins() {
		return coins;
	}

	public boolean win() {
		return slots[0] == slots[1] && slots[1] == slots[2];
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int[] getSlots() {
		return slots;
	}

}
