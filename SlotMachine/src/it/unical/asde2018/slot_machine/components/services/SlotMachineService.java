package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.User;

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
	
	public void faiGiocata(User user, int somma) {
		boolean vincita=false;
		List<Integer> numeri = this.getNumbers();
		if(numeri.get(0)==numeri.get(1)&& numeri.get(0)==numeri.get(2)) {
			vincita=true;
		}
		switch(somma){
		case 0:
			user.faiGiocataDa5();
			if(vincita)
				user.vincita(5);
		case 1:
			user.faiGiocataDa10();
			if(vincita)
				user.vincita(10);
		case 2:
			user.faiGiocataDa20();
			if(vincita)
				user.vincita(20);
		}
		
	}
	
}
