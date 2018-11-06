package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;
import it.unical.asde2018.slot_machine.model.Player;

@Controller
public class SlotMachineController {
	
	@Autowired
	SlotMachineService slotMS;
	
	@PostMapping("bet")
	public String bet(Model m,@RequestParam int bet,HttpSession httpSession) {
		System.out.println("p"+(Player)(httpSession.getAttribute("player"))==null);
		m.addAttribute("result",slotMS.bet(((Player)(httpSession.getAttribute("player"))), bet));
		
		
		return "slot-machine";
	}

}
