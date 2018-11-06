package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import org.springframework.stereotype.Service;


@Service
public class SlotMachine {
	int pos1;
	int pos2;
	int pos3;
	int coins;
	Random rand = new Random();
	
	
	
	public int getPos1() {
		return pos1;
	}


	public void setPos1(int pos1) {
		this.pos1 = pos1;
	}


	public int getPos2() {
		return pos2;
	}


	public void setPos2(int pos2) {
		this.pos2 = pos2;
	}


	public int getPos3() {
		return pos3;
	}


	public void setPos3(int pos3) {
		this.pos3 = pos3;
	}


	public int getCoins() {
		return coins;
	}


	public void setCoins(int coins) {
		this.coins = coins;
	}



	
	

	
	
	public void startGame(int coins) {
		this.coins=coins;
	}
	
	
	public int play(int coins) {
		if(coins<0 && this.coins<=coins) {
			return 0;
		}
		pos1 = rand.nextInt(3);
		pos2 = rand.nextInt(3);
		pos3 = rand.nextInt(3);
		if( checkWin() ) {
			return coins*9;
		}else {
			return coins*-1;
		}
	}
	
	public boolean checkWin() {
		if( pos1==pos2 && pos2==pos3) {
			return true;
		}
		return false;
	}
	
	
	
}
