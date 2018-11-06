package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Coins;
import it.unical.asde2018.slot_machine.model.Slot;

@Service
public class SlotMachineService {

	public Slot slotService;
	public Coins coinsService;

	@PostConstruct
	public void init() {
		coinsService= new Coins(200);
		slotService= new Slot(0, 0, 0);
	}

	public Slot getSlotService() {
		return slotService;
	}

	public void setSlotService(Slot slotService) {
		this.slotService = slotService;
	}

	public int getCoinsService() {
		return coinsService.getCoins();
	}

	public void setCoinsService(Coins coinsService) {
		this.coinsService = coinsService;
	}
	
	public void play() {
		slotService.setNumberOne(new Random().nextInt(3));
		slotService.setNumberTwo(new Random().nextInt(3));
		slotService.setNumberThree(new Random().nextInt(3));
	}

}
