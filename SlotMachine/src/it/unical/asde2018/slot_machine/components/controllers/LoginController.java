package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.model.User;
import it.unical.asde2018.slot_machine.model.UserGame;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("user") != null) {
			return "redirect:/home";
		}
		return "login";
	}

	@PostMapping("/")
	public String loginAttempt(@RequestParam String username, @RequestParam String password, HttpSession session,
			Model model) {
		if (loginService.login(username, password)) {
			User user = loginService.getUser(username, password);
			UserGame userGame = new UserGame(user, user.getCoins());
			session.setAttribute("user", username);
			session.setAttribute("userGame", userGame);
			return "redirect:/home";
		}
		model.addAttribute("error", "Wrong credentials");
		return "login";
	}

}
