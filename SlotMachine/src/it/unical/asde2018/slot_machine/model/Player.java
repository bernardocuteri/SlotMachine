package it.unical.asde2018.slot_machine.model;

public class Player {
	
	private String username;
	private int credit = 200;
	
	public Player(String user) {
		super();
		username = user;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}
