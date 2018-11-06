package it.unical.asde2018.slot_machine.components.services;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {
	private int betcoins;// = 5, betcoin2 = 10, betcoing3 = 20;
	private int initialcoins = 200;
	private int  numgen1=0,numgen2=1,numgen3=2;// [2,1,2]

//
//	// generate random no(0,1,2)
//	public static void getStreamOfRandomIntsWithRange(int num, int min, int max) {
//		Random random = new Random();
//		random.ints(num, min, max).sorted().forEach(System.out::println);
//	}

	public double getPrize(betcoins) {
		Betcoins betcons=new Betcoins(5,10,20);

		if (numgen1 == numgen2 && numgen2 == numgen3) {

			 

				return prize= betcoins*9; 

			} else {

			
		return prize=0;
	}
}
