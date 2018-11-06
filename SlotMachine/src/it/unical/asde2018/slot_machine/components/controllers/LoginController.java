package it.unical.asde2018.slot_machine.components.controllers;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("login")
	public String index(HttpSession session, Model model,@RequestParam String username, @RequestParam String password) {
		
		if(loginService.checkCredential(username, password)) {
		
			session.setAttribute("user", username);
			return "slot-machine";
		}
		model.addAttribute("error", "Wrong credentials!!");
		return "login";
	}
}
