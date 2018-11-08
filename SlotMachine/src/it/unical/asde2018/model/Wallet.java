package it.unical.asde2018.model;

public class Wallet {

	private int amoutOfCoin;
	
	private boolean emptyCoin;
	public Wallet(int walletAmount)
	{
		amoutOfCoin=walletAmount;
		emptyCoin=false;
	}
	
	public void addToWallet(int amout)
	{
	amoutOfCoin=amoutOfCoin+amout;	
	}
	
	public void removeFromWallet(int amout)
	{
		if(amoutOfCoin>amout)
		{
			amoutOfCoin=amoutOfCoin-amout;
		}
		else
		{
			emptyCoin=true;
		}
	}

	public int getAmoutOfCoin() {
		return amoutOfCoin;
	}

	public void setAmoutOfCoin(int amoutOfCoin) {
		this.amoutOfCoin = amoutOfCoin;
	}

	public boolean isEmptyCoin() {
		return emptyCoin;
	}

	public void setEmptyCoin(boolean emptyCoin) {
		this.emptyCoin = emptyCoin;
	}
	
	
}
