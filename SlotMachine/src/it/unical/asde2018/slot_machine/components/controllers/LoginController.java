package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LogInService;

@Controller
public class LoginController
{

	@Autowired
	private LogInService logInService;

	@GetMapping("/")
	public String index(HttpSession session, Model model) {

		if (session.getAttribute("username") != null)
			return "slot-machine";
		return "login";

	}

	@GetMapping("/login")
	public String loginAttempt(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) {
		if (logInService.login(username, password))
		{
			session.setAttribute("username", username);
			return "redirect:/slot-machine";
		}

		model.addAttribute("error", "Wrong credentials!");
		return "login";
	}

}
