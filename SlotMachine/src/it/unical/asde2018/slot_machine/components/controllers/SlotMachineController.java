package it.unical.asde2018.slot_machine.components.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SlotMachineController {
	
		@Autowired
	SlotMachineService slotMachine;
	
	@GetMapping("/result")
	public String bet(Model model,HttpSession httpSession) {
 
		return "slot-machine";
	}
	

	
} 
	    
