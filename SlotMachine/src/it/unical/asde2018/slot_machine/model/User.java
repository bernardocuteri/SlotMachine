package it.unical.asde2018.slot_machine.model;

public class User {

	private int balance;

	public User() {
		super();
		balance = 200;
	}

	public void faiGiocataDa5() {
		balance-=5;
	}

	public void faiGiocataDa10() {
		balance-=10;
	}

	public void faiGiocataDa20() {
		balance-=20;
	}
	
	public void vincita(int puntata) {
		balance = balance + puntata*3;
	}
}
