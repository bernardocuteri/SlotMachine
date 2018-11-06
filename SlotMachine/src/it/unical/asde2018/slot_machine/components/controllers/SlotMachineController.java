package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController {

	@Autowired
	private SlotMachineService slotMachineService;
	
	@GetMapping("/play")
	public String play(@RequestParam int betAmount, HttpSession session, Model model) {
		int actualCredit = (int)session.getAttribute("credit");
		
		if(actualCredit>=betAmount) {
			int[] spinResult = slotMachineService.spin();
			int creditVariation = slotMachineService.creditVariation(betAmount, spinResult);
			session.setAttribute("lastSpin", spinResult);
			session.setAttribute("credit", actualCredit+creditVariation);
			session.setAttribute("SMMessage", "You "+(creditVariation>0?"won ":"lost ")+Math.abs(creditVariation)+" coins");
		}else {
			session.setAttribute("SMMessage", "Error: insufficient credit to place that bet");
		}
		
		return "slot-machine";
		
	}
	
}
