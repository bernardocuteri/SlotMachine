package it.unical.asde2018.slot_machine.components.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {
	@Autowired
	private SlotMachineService slotMachine;
	@PostMapping("/slot-machine")
	public String SlotMachine( Model model)  {
		model.addAttribute("credit", slotMachine.getCedit());		
		
		return "slot-machine";
	}
	@GetMapping("/slot-game")
	public String Play(@RequestParam int coins, Model model)  {
		if(slotMachine.getCedit() < 5) {
			model.addAttribute("noCredit", "You don have enough coins");
			return "redirect:/slot-machine";
		}
		else {
			int result = slotMachine.Game(coins);
			model.addAttribute("result", result);
			return "redirect:/slot-machine";
		}		
	}
}
