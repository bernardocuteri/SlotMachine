package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import it.unical.asde2018.slot_machine.model.Number;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private SlotMachineService slot;

	@GetMapping("/")
	public String index(Model model, HttpSession session) {

		if (session.getAttribute("user") != null) {
			session.invalidate();
			model.addAttribute("allRandomNumbers", slot.getAllRandomNumber());
			return "slot-machine";
		}
		return "login";
	}

	@GetMapping("/login")
	public String loginAttempt(@RequestParam String username, @RequestParam String password, HttpSession session,
			Model model) {

		if (loginService.login(username, password)) {
			session.setAttribute("user", username);
			return "redirect:/";
		}
		model.addAttribute("error", "Wrong credentials!");
		return "login";

	}

	@GetMapping("/guess")
	public String guessNumber(@RequestParam Integer num, Model model, HttpSession session) {
		for (Number number : slot.getAllRandomNumber()) {
			
		}
		return null;
	}
}
