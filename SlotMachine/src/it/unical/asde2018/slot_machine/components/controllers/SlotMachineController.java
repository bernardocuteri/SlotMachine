package it.unical.asde2018.slot_machine.components.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {
	
	@Autowired
	private SlotMachineService slotMachineService;
	
	@GetMapping("/bet")
	public String bet(Model model, @RequestParam int coins) {
		if(slotMachineService.getCoins() - coins >= 0) {
			int values[] = slotMachineService.generateNumbers();
			model.addAttribute("values", values);
			if(slotMachineService.bet(coins, values)) {
				model.addAttribute("won", slotMachineService.getCoins());
			} else {
				model.addAttribute("lost", slotMachineService.getCoins());
			}
			return "slot-machine";	
		}
		model.addAttribute("coins", slotMachineService.getCoins());
		model.addAttribute("insufficient", "Insufficient Coins!");
		return "slot-machine";
	}
}
