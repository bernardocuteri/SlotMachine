package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;
import it.unical.asde2018.slot_machine.model.SlotMachine;
import it.unical.asde2018.slot_machine.model.User;

@Controller
public class SlotMachineController {

	@Autowired
	SlotMachineService slotMachineService;

	@GetMapping("/play")
	public String play(HttpSession session, Model model) {
		final User user = (User) session.getAttribute("user");
		session.setAttribute("slotMachine", slotMachineService.playNewSlotMachine());
		model.addAttribute("coins", slotMachineService.getUserCoins(user.getUsername()));
		return "slot-machine";
	}

	@GetMapping("/beat")
	public String beat(@RequestParam String beat, Model model, HttpSession session) {
		final int beatChoice = Integer.parseInt(beat);
		final User user = (User) session.getAttribute("user");
		final SlotMachine slotMachine = (SlotMachine) session.getAttribute("slotMachine");
		slotMachineService.beat(beatChoice, slotMachine, user.getUsername());
//		model.addAttribute("slotMachine", slotMachineService.getSlotMachine());
		model.addAttribute("coins", slotMachineService.getUserCoins(user.getUsername()));
		return "slot-machine";
	}

}
