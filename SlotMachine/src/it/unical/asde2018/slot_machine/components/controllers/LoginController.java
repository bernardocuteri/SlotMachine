package it.unical.asde2018.slot_machine.components.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/")
	public String index() {
		return "login";
	}
	
	@GetMapping("/login")
	public String loginAttempt(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) {

		if(loginService.login(username, password)) {
			session.setAttribute("user", username);
			session.setAttribute("credit", 200);
			session.setAttribute("lastSpin", null);
			session.setAttribute("SMMessage", "Welcome to the Slot Machine");
			return "slot-machine";
		}
		
		model.addAttribute("error", "Wrong credentials!");
		return "login";
		
	}

}
