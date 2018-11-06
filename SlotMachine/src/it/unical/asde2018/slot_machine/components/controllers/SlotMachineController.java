package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;

@Controller
public class SlotMachineController
{
	@Autowired
	private SlotMachineService sms;

	@GetMapping("/slot-machine")
	public String goToSlot(HttpSession session, Model model) {
		if (session.getAttribute("username") != null)
		{
			if (sms.getLoggedUsers(session.getAttribute("username").toString()).getCoins() <= 0)
				model.addAttribute("error", "Non hai crediti sufficienti");

			model.addAttribute("values", sms.getTriple());
			model.addAttribute("user", sms.getLoggedUsers(session.getAttribute("username").toString()));
		}
		return "slot-machine";
	}

	@GetMapping("/takeasslot")
	public String takeASlot(HttpSession session, Model model, @RequestParam int bet) {

		String winLose = null;

		model.addAttribute("values", sms.getATriple());
		if (sms.winLose())
		{
			sms.setUserCoin(session.getAttribute("username").toString(), 9 * bet);
			winLose = "win";

		} else
		{
			sms.setUserCoin(session.getAttribute("username").toString(), -bet);
			winLose = "lose";
		}
		model.addAttribute("winlose", winLose);
		return "redirect:/slot-machine";
	}
}
