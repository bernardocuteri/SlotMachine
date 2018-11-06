package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;



@Service

public class SlotMachineService {
	private int num1;
	private int num2;
	private int num3;
	private int credit;
	
	@PostConstruct
	public void init() {
		
		credit = 200;
	}
	
	public int GenerateNumber() {
		Random random = new Random();
		return random.nextInt(2);	
	}
	
	public int Game( int coins) {
		num1 = GenerateNumber();
		num2 = GenerateNumber();
		num3 = GenerateNumber();
		 
		if(num1==num2 && num2==num3) {
			credit+=coins*9;
			return coins*9;
		}
		else {
			credit-= coins * -1;
			return coins * -1;
		}
			
	}
	public int getCedit() {
		return credit;
	}
}
