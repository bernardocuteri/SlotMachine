package it.unical.asde2018.slot_machine.model;

import java.util.Random;

public class Game {

	private int n1;
	private int n2;
	private int n3;
	
	public boolean allEquals() {
		return n1==n2&&n2==n3;
	}
	public void random() {
		 n1=new Random().nextInt(3);
		 n2=new Random().nextInt(3);
		 n3=new Random().nextInt(3);
		
	}
	public Game(int n1, int n2, int n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public Game() {
		// TODO Auto-generated constructor stub
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
