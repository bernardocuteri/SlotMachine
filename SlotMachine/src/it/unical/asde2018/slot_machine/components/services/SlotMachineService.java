package it.unical.asde2018.slot_machine.components.services;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.SlotMachine;

@Service
public class SlotMachineService {
	
	private SlotMachine slotMachine;
	
	@PostConstruct
	public void init() {
		slotMachine = new SlotMachine();
	}
	
	public int[] slotValues() {
		return slotMachine.getColumns();
	}
	
	public void spin() {
		slotMachine.spin();
	}
}
