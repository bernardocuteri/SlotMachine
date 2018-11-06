package it.unical.asde2018.slot_machine.components.controllers;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/")
	public String index() {

		return "login";
	}

	@PostMapping("/login")
	public String doLogin(Model model, @RequestParam String username, @RequestParam String password) {

		if (username.equals("hieu") && password.equals("1234")) {
			model.addAttribute("welcome", "Welcome Hieu");
			model.addAttribute("currentTime", new Date());
			return "index";
		}

		model.addAttribute("error", "Wrong credential! Login again!");
		return "login";
	}
}
