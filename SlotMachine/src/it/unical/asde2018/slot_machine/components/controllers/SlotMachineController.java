package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;
import it.unical.asde2018.slot_machine.domain.Player;



@Controller
public class SlotMachineController
{

	@Autowired
	private SlotMachineService slotMachine;

	@GetMapping("slotMachine")
	public String goToIndex(Model model, HttpSession session)
	{

		Player player = new Player(200, (String) session.getAttribute("user"));

		model.addAttribute("player", player);
		session.setAttribute("player", player);
		return "slot-machine";

	}

	@GetMapping("play")
	public String play(@RequestParam String bet, Model model, HttpSession session)
	{

		Player player = (Player) session.getAttribute("player");

		slotMachine.gioca(player, Integer.parseInt(bet));

		session.setAttribute("player", player);

		model.addAttribute("player", player);
		return "slot-machine";

	}
}
