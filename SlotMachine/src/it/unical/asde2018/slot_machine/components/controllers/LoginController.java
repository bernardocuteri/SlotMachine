package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.bind.Binder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.model.Credential;
import it.unical.asde2018.slot_machine.model.Player;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("user") != null) {			
			return "slot-machine";
		} else {
			return "login";
		}
	}

	@PostMapping("/doLogin")
	public String doLogin(@Valid Credential credential, BindingResult result, Model model, HttpSession session) {

		if (result.hasErrors()) {
			return "login";
		}

		Player logged = loginService.findUserWithCredential(credential);
		if (logged == null) {
			return "login";
		}
		session.setAttribute("user", logged);
		return "redirect:/";
	}

	@GetMapping("/doLogout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "login";
	}

}
