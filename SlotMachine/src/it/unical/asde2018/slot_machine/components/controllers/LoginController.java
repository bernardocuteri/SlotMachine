package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import it.unical.asde2018.slot_machine.components.services.*;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	
//	@GetMapping("/")
//	public String index(Model model, HttpSession session) {
//
//		if (session.getAttribute("user") != null) {
//			return "slot-machine";
//		}
//		return "login";
//	}

	@GetMapping("login")
	public String index(HttpSession session, Model model, @RequestParam String username, @RequestParam String password) {
		
		if (loginService.login(username, password)) {
			session.setAttribute("user", username);
			return "redirect:/";
		}

		model.addAttribute("error", "Wrong Credentials!");
		return "login";

	}
	

}
