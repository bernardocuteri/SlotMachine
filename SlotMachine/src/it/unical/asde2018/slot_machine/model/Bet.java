package it.unical.asde2018.slot_machine.model;

public class Bet {

	private int[] numbers;
	private boolean won;

	public Bet(int[] numbers, boolean won) {
		super();
		this.numbers = numbers;
		this.won = won;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public boolean isWon() {
		return won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}

}
