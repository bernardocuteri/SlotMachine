package it.unical.asde2018.slot_machine.model;

import java.util.Random;

public class Match
{
	private final int START_COIN = 200;

	private boolean firstGame;

	private int numberLeft;
	private int numberCenter;
	private int numberRight;

	private int balance;

	private boolean win;

	public Match()
	{
		setFirstGame(true);
		setBalance(START_COIN);
		generateNumber();
	}

	public void updateBalance(int bet)
	{
		if (isWin())
		{
			setBalance(getBalance() + (bet * 9));
		} else
		{
			setBalance(getBalance() - bet);
		}
	}

	public int getNumberRight()
	{
		return numberRight;
	}

	public void generateNumber()
	{
		setWin(false);

		Random random = new Random();
		setNumberLeft(random.nextInt(3));
		setNumberCenter(random.nextInt(3));
		setNumberRight(random.nextInt(3));
	}

	public void setNumberRight(int numberRight)
	{
		this.numberRight = numberRight;
	}

	public int getNumberCenter()
	{
		return numberCenter;
	}

	public void setNumberCenter(int numberCenter)
	{
		this.numberCenter = numberCenter;
	}

	public int getNumberLeft()
	{
		return numberLeft;
	}

	public void setNumberLeft(int numberLeft)
	{
		this.numberLeft = numberLeft;
	}

	public boolean isWin()
	{
		if (getNumberLeft() == getNumberCenter() && getNumberCenter() == getNumberRight())
		{
			setWin(true);
		}

		return win;
	}

	public void setWin(boolean win)
	{
		this.win = win;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	public int getSTART_COIN()
	{
		return START_COIN;
	}

	public boolean isFirstGame()
	{
		return firstGame;
	}

	public void setFirstGame(boolean firstGame)
	{
		this.firstGame = firstGame;
	}

}
