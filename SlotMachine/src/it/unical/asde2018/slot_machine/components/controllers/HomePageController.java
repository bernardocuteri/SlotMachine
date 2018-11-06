package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	@GetMapping("/")
	public String index(HttpSession session, Model model) {

		if (session.getAttribute("user") == null) {
			return "login";
		}
		return "slot-machine";
	}
}
