package it.unical.asde2018.slot_machine.components.controllers;

import it.unical.asde2018.slot_machine.components.models.User;
import it.unical.asde2018.slot_machine.components.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
	
	@GetMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("login", "user", new User());
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user, HttpSession session) {
	    System.out.println(user);

	    User authenticatedUser = userService.authenticate(session, user);

	    if (authenticatedUser == null) {
	        return "redirect:/";
        }

		return "redirect:/slot-machine";
	}

}
