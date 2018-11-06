package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginServices;
import it.unical.asde2018.slot_machine.model.Player;

@Controller
public class LoginController {
	
	@Autowired
	private LoginServices loginService;
	
	@GetMapping("/")
	public String index(HttpSession httpSession) {
		if(httpSession.getAttribute("player")==null)
			return "login";
		else
			return "slot-machine";
	}
	
	@PostMapping("login")
	public String login(Model model, @RequestParam String email, @RequestParam String pwd, HttpSession httpSession){
		Player p;
		if((p=loginService.login(email, pwd))!=null) {
			httpSession.setAttribute("player", p);
			return "redirect:/";
		}
		model.addAttribute("error", true);
		return "login";		
	}

}
