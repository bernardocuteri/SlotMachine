package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {

	@Autowired
	SlotMachineService slotMachineService;
	
	@GetMapping("/SlotMachine")
	public String slotMachine(HttpSession session,Model model) {
		
		String username = (String) session.getAttribute("username");
		session.setAttribute("coins",slotMachineService.getCoins(username));
		return "slot-machine";
	}
	
	@GetMapping("/Play")
	public  String play(int bet,HttpSession session,Model model) 
	{
		String username= (String) session.getAttribute("username");
		
		
		int [] numbers = slotMachineService.play(username,bet);
		session.setAttribute("first", numbers[0]);
		session.setAttribute("second", numbers[1]);
		session.setAttribute("third", numbers[2]);
		
		if(numbers[0]== numbers[1]&& numbers[1]==numbers[2])
		{	slotMachineService.addWin(username,bet);
		session.setAttribute("win", "Congratulation, You Win!!!");
		}
		else
		session.setAttribute("win", "Sorry, Try again!!!");
		
		return "redirect:/";
	}
	
	@GetMapping("/Restart")
	public String restart(HttpSession session,Model model)
	{
		String username =(String) session.getAttribute("username");
		slotMachineService.setCoins(username,200);
		session.invalidate();
		return "redirect:/";
		
	}
	
	
	

}
