package it.unical.asde2018.slot_machine.model;

import java.util.List;

public class UserGame {

	public static int INITIAL_COINS = 200;

	private int coins;

	private User user;

	private List<Integer> lastResults;

	private boolean lastBetIsWin = false;

	private int lastBet = 0;

	private boolean lastBetAdmitted = true;

	public UserGame(User user, int coins) {
		super();
		this.user = user;
		this.coins = coins;
	}

	public int getCoins() {
		return coins;
	}

	public int getLastBet() {
		return lastBet;
	}

	public List<Integer> getLastResults() {
		return lastResults;
	}

	public boolean isLastBetAdmitted() {
		return lastBetAdmitted;
	}

	public boolean isLastBetIsWin() {
		return lastBetIsWin;
	}

	public void setCoins(int coins) {
		user.setCoins(coins);
		this.coins = coins;
	}

	public void setLastBet(int lastBet) {
		this.lastBet = lastBet;
	}

	public void setLastBetAdmitted(boolean lastBetAdmitted) {
		this.lastBetAdmitted = lastBetAdmitted;
	}

	public void setLastBetIsWin(boolean lastBetIsWin) {
		this.lastBetIsWin = lastBetIsWin;
	}

	public void setLastResults(List<Integer> lastResults) {
		this.lastResults = lastResults;
	}

}
