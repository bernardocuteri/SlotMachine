package it.unical.asde2018.slot_machine.entity;

import java.util.Random;

public class Triple
{
	private int first;
	private int second;
	private int third;

	public Triple getAtriple() {
		int one = new Random().nextInt(3);
		int two = new Random().nextInt(3);
		int three = new Random().nextInt(3);
		return new Triple(one, two, three);

	}

	public Triple(int first, int second, int third)
	{
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

}
