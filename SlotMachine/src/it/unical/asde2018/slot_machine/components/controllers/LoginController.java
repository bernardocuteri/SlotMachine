package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService login;

	@GetMapping("/login")
	public String index() {
		return "login";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/";

	}

	@PostMapping("/login")
	public String performLogin(@RequestParam String user, @RequestParam String pass,Model model,HttpSession session) {
		if(login.check(user,pass)) {
			session.setAttribute("user", user);
			return "redirect:/";
		}
		model.addAttribute("fail","Your credentials are incorrect");
		return "login";
	}

}
