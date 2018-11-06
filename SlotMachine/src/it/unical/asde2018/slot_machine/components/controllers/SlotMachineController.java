package it.unical.asde2018.slot_machine.components.controllers;

import javax.websocket.Session;

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
	public String bet(@RequestParam String bet, Session session, Model model) {
		
		System.out.println("puntata ----> " + bet);
//		slotMachine.spin();
		
		return "redirect:/";
	}
	
}
