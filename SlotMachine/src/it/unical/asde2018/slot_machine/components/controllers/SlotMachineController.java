package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {
	
	static int totalCoins = 200;
	@Autowired
	private SlotMachineService slotmachineService;
	
	@PostMapping("/bet")
	public String bet(HttpSession session, @RequestParam int coins, Model model){
		
		if (totalCoins <= 0)
		{
			session.setAttribute("noCoins", "You've finished your coins");
			model.addAttribute("noCoins", session.getAttribute("noCoins"));
		}
		
		if(coins > 0)
			session.setAttribute("totalCoins", totalCoins - coins);
		
		model.addAttribute("totalCoins", session.getAttribute("totalCoins"));
		
		
		session.setAttribute("num1", slotmachineService.getnum1());
		model.addAttribute("num1", session.getAttribute("num1"));
		
		session.setAttribute("num2", slotmachineService.getnum2());
		model.addAttribute("num2", session.getAttribute("num2"));
		
		session.setAttribute("num3", slotmachineService.getnum3());
		model.addAttribute("num3", session.getAttribute("num3"));
		
		
		if(slotmachineService.allEquals()) {
			session.setAttribute("win", "YOU WIN");
			model.addAttribute("win", session.getAttribute("win"));
			
			session.setAttribute("prize", coins*9);
			model.addAttribute("prize", session.getAttribute("prize"));
		}
		
		
		return "redirect:/";
		
	}

}
