package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {
	
	private List<Integer> numeri;
	private Random r;
	
	@PostConstruct
	public void init() {
		numeri = new ArrayList<Integer>();
		r = new Random();
	}
	
	public List<Integer> getNumbers() {
		
		numeri.add(r.nextInt(2 - 0 + 1) + 0);
		numeri.add(r.nextInt(2 - 0 + 1) + 0);
		numeri.add(r.nextInt(2 - 0 + 1) + 0);
		
		return numeri;	
	}
	
	public void faiGiocata() {
		
	}
	
}
