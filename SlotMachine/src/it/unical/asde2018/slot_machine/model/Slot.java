package it.unical.asde2018.slot_machine.model;

public class Slot {

	private int numberOne;
	private int numberTwo;
	private int numberThree;

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public Slot(int numberOne, int numberTwo, int numberThree) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = numberThree;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public int getNumberThree() {
		return numberThree;
	}

	public void setNumberThree(int numberThree) {
		this.numberThree = numberThree;
	}
}
