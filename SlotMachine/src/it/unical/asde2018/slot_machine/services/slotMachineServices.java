package it.unical.asde2018.slot_machine.services;

import java.util.ArrayList;
import java.util.Random;

public class slotMachineServices {
	//Generates 3 random numbers for slot machine
	public static void slotNumbers(ArrayList<Integer> slotMachine) {
		int count = 0;
		while (count<3) {
			Random slot = new Random();
			int slotNumber= slot.nextInt(0)+1;
			slotMachine.add(slotNumber);
		}
		return;
	}
	
	//Determine points earned on slot machine
	public static int winnings(ArrayList<Integer> slotMachine) {
		int number1 = slotMachine.get(0);
		int number2 = slotMachine.get(1);
		int number3 = slotMachine.get(2);
		int points=0;
		
		//if three numbers match each other
		if(number1==number2||number2==number3||number3==number1) {
			points=100;
			return points;
			
		}
		else {
			points=0;
			return points;
		}
		
	}
	
}
