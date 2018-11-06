package it.unical.asde2018.slot_machine.components.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineServices;

@Controller
public class SlotMachineController
{

	@Autowired
	private SlotMachineServices slotMachineServices;

	@GetMapping("/login")
	public String indexSlot()
	{
		return "redirect:/play";
	}

	@GetMapping("/play")
	public String play(Model model, @RequestParam int bet)
	{
		slotMachineServices.getMatch().setWin(false);

		slotMachineServices.getMatch().generateNumber();

		model.addAttribute("numberLeft", slotMachineServices.getMatch().getNumberLeft());
		model.addAttribute("numberCenter", slotMachineServices.getMatch().getNumberCenter());
		model.addAttribute("numberRight", slotMachineServices.getMatch().getNumberRight());

		slotMachineServices.getMatch().updateBalance(bet);

		model.addAttribute("win", slotMachineServices.getMatch().isWin());

		model.addAttribute("balance", slotMachineServices.getMatch().getBalance());

		return "slot-machine";
	}
}
