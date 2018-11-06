package it.unical.asde2018.slot_machine.model;

public class User {
	
	private String username;	
	private int coins;

	public User(String username,int coins) {
		super();
		this.username = username;
		this.setCoins(coins);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	
}
