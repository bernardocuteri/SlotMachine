package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.services.loginServices;

@Controller
public class LoginController {

	@Autowired
	private loginServices loginServices;

	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("user") != null) {
			return "slot-machine";
		}
		return "login";
	};

	@GetMapping("/login")
	public String loginAttempt(Model model, @RequestParam String username, @RequestParam String password,
			HttpSession session) {
		if (loginServices.login(username, password)) {
			session.setAttribute("user", username);
			return "redirect:/";
		}
		model.addAttribute("error", "Wrong Credentials");
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return"login";
	}

}
