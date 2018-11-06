package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {
	
	private int numero1;
	private int numero2;
	private int numero3;
	
	@PostConstruct
	public void init() {
		
		numero1 = (int) (Math.random() + 2);
		numero2 = (int) (Math.random() + 2);
		numero3 = (int) (Math.random() + 2);
		
		

	}
	
	public int getnum1() {
		return numero1;
	}
	
	public int getnum2() {
		return numero2;
	}
	
	public int getnum3() {
		return numero3;
	}
	
	public boolean allEquals() {
		return (numero1 == numero2) && (numero2 == numero3);
	}

}
