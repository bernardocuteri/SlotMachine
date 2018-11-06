package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachinesService;

@Controller
public class SlotMachinesController {
	@Autowired
	private SlotMachinesService slotMachinesService;

	@GetMapping("/")
	public String goToSlotMachines(HttpSession session, Model model) {
		if (session.getAttribute("user") != null) {
			model.addAttribute("coins", slotMachinesService.getCoins());
			return "slot-machine";
		}
		return "login";
	}

	@GetMapping("/play")
	public String play(@RequestParam int bet, Model model) {
		model.addAttribute("results", slotMachinesService.play(bet));
		model.addAttribute("coins", slotMachinesService.getCoins());
		model.addAttribute("status", slotMachinesService.getStatus());
		return "slot-machine";
	}

	@GetMapping("/newgame")
	public String newGame(Model model) {
		slotMachinesService.newGame();
		model.addAttribute("coins", slotMachinesService.getCoins());
		return "slot-machine";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
