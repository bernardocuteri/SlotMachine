package it.unical.asde2018.slot_machine.model;
import java.util.Random;

public class NumberGen {

	private static final int min = 0;
	private static final int max = 2;
	private int n1 = 0;
	private int n2 = 0;
	private int n3 = 0;
	Random rand = new Random();

	public NumberGen() {
		n1 = rand.nextInt((max - min) + 1) + min;
		n2 = rand.nextInt((max - min) + 1) + min;
		n3 = rand.nextInt((max - min) + 1) + min;
	}

	public void generateNumber() {
		n1 = rand.nextInt((max - min) + 1) + min;
		n2 = rand.nextInt((max - min) + 1) + min;
		n3 = rand.nextInt((max - min) + 1) + min;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
}
