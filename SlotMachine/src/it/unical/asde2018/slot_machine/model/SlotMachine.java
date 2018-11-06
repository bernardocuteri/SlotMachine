package it.unical.asde2018.slot_machine.model;

import java.util.Random;

public class SlotMachine {

	private final int[] slots;
	private final Random r;

	public SlotMachine() {
		slots = new int[3];
		r = new Random();
	}

	public void round() {
		for (int i = 0; i < slots.length; ++i) {
			slots[i] = r.nextInt(3);
		}
	}

	public boolean win() {
		return slots[0] == slots[1] && slots[1] == slots[2];
	}

	public int[] getSlots() {
		return slots;
	}

}
