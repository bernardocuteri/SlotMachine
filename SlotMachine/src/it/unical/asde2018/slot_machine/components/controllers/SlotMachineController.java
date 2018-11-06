package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;
import it.unical.asde2018.slot_machine.model.Bet;
import it.unical.asde2018.slot_machine.model.Player;

@Controller
public class SlotMachineController {

	@Autowired
	private SlotMachineService machineService;

	@PostMapping("/slotmachine/doBet")
	public String doBet(HttpSession session, @RequestAttribute int betAmount, Model model) {

		if (betAmount < 5) {
			model.addAttribute("message", "insufficient coins to bet");
		}
		Player player = (Player) session.getAttribute("user");
		Bet bet = machineService.play(player, betAmount);
		model.addAttribute("bet", bet);

		return "redirect:/";
	}

}
