package it.unical.asde2018.slot_machine.model;

public class Player {
	private int coin;
	private String username;
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Player(String username) {
		this.coin=200;
		this.username = username;
	}
	
}
