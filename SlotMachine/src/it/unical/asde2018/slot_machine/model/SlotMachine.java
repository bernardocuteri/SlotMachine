package it.unical.asde2018.slot_machine.model;

import java.util.Random;

public class SlotMachine {
	
	private int [] columns;
	
	public SlotMachine() {
		columns = new int [3];
		for (int i : columns) {
			columns[i] = -1;
		}
	}
	
	public void spin() {
		Random rand = new Random();
		for (int i : columns) {
			columns[i] = rand.nextInt(3);
		}
	}

	public int[] getColumns() {
		return columns;
	}
}
