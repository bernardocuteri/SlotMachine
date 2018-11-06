package it.unical.asde2018.slot_machine.components.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String index() {
		
		return "login";
	}

}
