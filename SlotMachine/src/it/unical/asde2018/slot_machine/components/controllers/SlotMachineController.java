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
	private SlotMachineService slotMachineService;

	@GetMapping("/")
	public String goToHomePage(HttpSession session, Model model) {

		if (session.getAttribute("user") != null) {
			model.addAttribute("coin", slotMachineService.getCoins());

			model.addAttribute("number", slotMachineService.getGeneratedNumber());

			if (session.getAttribute("start") != null) {
				if (slotMachineService.equalNumber())
					model.addAttribute("win", "You Win!!");
				else if (slotMachineService.getCoins() == 0)
					model.addAttribute("lose", "You Finish the coin!!");
			}

			session.setAttribute("start", "started");
			return "slot-machine";
		}

		return "login";
	}

	@GetMapping("/five")
	public String decreaseFiveCoin(HttpSession session, Model model) {

		chek(5);
		return "redirect:/";

	}

	@GetMapping("/ten")
	public String decreaseTenCoin(HttpSession session, Model model) {

		chek(10);
		return "redirect:/";

	}

	@GetMapping("/twenty")
	public String decreaseTwentyCoin(HttpSession session, Model model) {
		chek(20);
		return "redirect:/";

	}

	private void chek(int coin) {
		if (slotMachineService.getCoins() - coin >= 0) {
			slotMachineService.setCoins(slotMachineService.getCoins() - coin);

			slotMachineService.generateNumber();

			if (slotMachineService.equalNumber())
				slotMachineService.setCoins(slotMachineService.getCoins() + (coin * 3));
		}
	}
}
