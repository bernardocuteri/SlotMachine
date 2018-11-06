package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.LoginService;
import it.unical.asde2018.slot_machine.components.services.SlotMachine;








@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@Autowired
	SlotMachine slotMachine;
	
	@GetMapping("/")
	public String goToIndex(Model m, HttpSession session) {
		
		if(session.getAttribute("user")!=null) {
			//m.addAttribute("posts",blogService.getAllPost());
			return "slot-machine";
		}else {
			return "login";
		}
	}
	
	@GetMapping("/login")
	public String loginAttempt(Model model,@RequestParam String username, @RequestParam String password, HttpSession session) {
		// TODO Auto-generated method stub
		if(loginService.login(username, password)) {
			session.setAttribute("user", username);
			session.setAttribute("coins", 200);
			System.out.println("sono qui");
			return "redirect:/";
		}
		model.addAttribute("error","Wrong Credential");
		return "login";
		
			
		
	}
	
	@GetMapping("/slot-machine")
	public String play(Model model,@RequestParam int bets, HttpSession session) {
		// TODO Auto-generated method stub
		if(session.getAttribute("user")!=null) {
			if(bets!=5 && bets!=10 && bets!=20) {
				model.addAttribute("message","Admitted 5 10 or 15 Coins");
				return "slot-machine";
			}
			if((int)session.getAttribute("coins")<=0) {
				model.addAttribute("message","");
				return "slot-machine";
			}
			System.out.println("sono qui1");
			slotMachine.setCoins((int)session.getAttribute("coins"));
			slotMachine.setCoins(slotMachine.getCoins()+slotMachine.play(bets));
			session.setAttribute("coins", slotMachine.getCoins());
			model.addAttribute("num1",slotMachine.getPos1());
			model.addAttribute("num2",slotMachine.getPos1());
			model.addAttribute("num3",slotMachine.getPos3());
			if(slotMachine.checkWin()) {
				model.addAttribute("message","Wins "+ bets*9);
			}else {
				
				model.addAttribute("message","You lose  "+ bets + " Coins");
			}
			return "slot-machine";
		}
		model.addAttribute("error","Wrong Credential");
		return "login";		
	}

}
