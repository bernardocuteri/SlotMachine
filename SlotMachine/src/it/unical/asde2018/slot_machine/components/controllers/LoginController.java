package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/")
	public String goToHomePage(HttpSession session, Model model) {
		return "login";
	}
	
	@PostMapping("login")
	public String performLogin(HttpSession session, Model model, @RequestParam String username, @RequestParam String password) {
		
		
		if(loginService.login(username, password)) {
			session.setAttribute("user", username);
			return "logged";
		}
		model.addAttribute("error", "Wrong credentials!!");
		return "login";
	}
	
	
}
