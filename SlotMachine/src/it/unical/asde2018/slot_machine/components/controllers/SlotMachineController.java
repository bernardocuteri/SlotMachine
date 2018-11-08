package it.unical.asde2018.slot_machine.components.controllers;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {
	
	@Autowired
	private SlotMachineService slotMachineService;
	
	@GetMapping("/")
	public String goToHomePage(HttpSession session, Model model) {
		if(session.getAttribute("user")==null) {
			return "login";
		}
		//model.addAttribute("currentTime", new Date());
		//model.addAttribute("welcomeMessage", "Welcome "+session.getAttribute("user"));
		model.addAttribute("numbers", slotMachineService.getNumbers());
		model.addAttribute("wallet", slotMachineService.getWallet());
		model.addAttribute("firstTime",true);
		
		return "slot-machine";
	}
	
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	@PostMapping(params="bet5")
	public String performBetFive(HttpSession session, Model model) {
		
		model.addAttribute("firstTime",false);
		slotMachineService.bet(5);
		slotMachineService.generateNumber();
		
		model.addAttribute("numbers", slotMachineService.getNumbers());
		model.addAttribute("wallet", slotMachineService.getWallet());
		model.addAttribute("winMatch",slotMachineService.isWin());
		
		
		return "slot-machine";
	}
	
	@PostMapping(params="bet10")
	public String performBetTen(HttpSession session, Model model) {
		model.addAttribute("firstTime",false);
		slotMachineService.bet(10);
		model.addAttribute("wallet", slotMachineService.getWallet());
		model.addAttribute("winMatch",slotMachineService.isWin());
		model.addAttribute("numbers", slotMachineService.getNumbers());
		return "slot-machine";
	}
	
	@PostMapping(params="bet20")
	public String performBet20(HttpSession session, Model model) {
		model.addAttribute("firstTime",false);
		slotMachineService.bet(20);
		model.addAttribute("numbers", slotMachineService.getNumbers());
		model.addAttribute("wallet", slotMachineService.getWallet());
		model.addAttribute("winMatch",slotMachineService.isWin());
		
		return "slot-machine";
	}
	
	
	
	
	
}
