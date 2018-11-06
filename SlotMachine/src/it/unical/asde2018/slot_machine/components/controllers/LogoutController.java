package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogoutController {
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}

}
