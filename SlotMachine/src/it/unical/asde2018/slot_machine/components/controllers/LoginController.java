package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.model.User;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public String index() {
		return "login";
	}

	@GetMapping("/login")
	public String loginAttempt(@RequestParam String username, @RequestParam String password, HttpSession session,
			Model model) {
		if (loginService.login(username, password)) {
			session.setAttribute("user", new User(username));
			return "redirect:/play";
		}
		model.addAttribute("error", "Wrong credentials");
		return "login";
	}

}
