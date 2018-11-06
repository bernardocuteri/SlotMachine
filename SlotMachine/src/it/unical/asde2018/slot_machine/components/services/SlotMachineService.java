package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {
	
	Random rn = new Random();

	public int[] spin() {
		return new int[] {rn.nextInt(3),rn.nextInt(3),rn.nextInt(3)};
	}
	
	public int creditVariation(int bet,int[] spinResult) {
		/*
		 * Given a bet and a spin result, compute the variation to the user
		 * credit. (Note: win amounts and criteria depends on the slot machine
		 * service)
		 */
		
		if(spinResult.length!=3) {
			throw new IllegalArgumentException("This slot machine has 3 rows!");
		}
		int balance = -bet; // The bet was made a certain stack was paid
		if(spinResult[0]==spinResult[1] && spinResult[1]==spinResult[2]) {
			balance += bet*9; // Win 9 times the pot and add to the balance (where bet was paid)
		}
		return balance;
	}
	
}
