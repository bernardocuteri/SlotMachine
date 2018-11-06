package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

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
	
	@GetMapping("/spin")
	public String spin(@RequestParam String bet,HttpSession session, Model model) {
		if(slotMachineService.canBet(Integer.parseInt(bet))) {
			model.addAttribute("coins", slotMachineService.howMuchCoins());
			//model.addAttribute("error", "Not enough money");
			return "slot-machine";
		}
		model.addAttribute("error", "Not enough money");
		//model.addAttribute("coins", slotMachineService.setBetting(bet));
		return "slot-machine";		
	}

}
