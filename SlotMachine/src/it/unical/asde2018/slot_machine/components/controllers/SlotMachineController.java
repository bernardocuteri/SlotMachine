package it.unical.asde2018.slot_machine.components.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private SlotMachineService slotmachineService;
	
	@GetMapping("slot-machine")
	public String alleSlot(Model model) {
		model.addAttribute("numbers",slotmachineService.getNumbers());
		model.addAttribute("giocata",-1);
		return "slot-machine";
	}
	
	@PostMapping("slot-machine")
	public String faiGiocata(HttpSession session, Model model, @RequestParam String username, @RequestParam String password) {
		if(session.getAttribute("giocata")==0) {
			slotmachineService.
		}
		return "slot-machine";
	}
	
	
}
