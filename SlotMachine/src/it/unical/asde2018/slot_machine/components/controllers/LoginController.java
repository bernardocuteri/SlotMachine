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
	LoginService loginService;
	
	@GetMapping("/")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("user") != null) {
			session.setAttribute("totalCoins", 200);
			return "slot-machine";
		}
		return "login";
		
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String uname, @RequestParam String psw, HttpSession session, Model model) {
		
		if(loginService.checkCredentials(uname, psw)) {
			session.setAttribute("user", uname);
			return "slot-machine";
		}
		
		model.addAttribute("error", "Wrong Credentials!");
		return "login";
	}

}
