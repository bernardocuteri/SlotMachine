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
	private SlotMachineService slotService;

	@GetMapping("play")
	public String play(@RequestParam String importo, HttpSession session, Model model) {
		System.out.println("imposrt" + importo);
		model.addAttribute("coinsRimanenti", slotService.getCoinsService());
		slotService.play();
		model.addAttribute("num1", slotService.getSlotService().getNumberOne());
		model.addAttribute("num2", slotService.getSlotService().getNumberTwo());
		model.addAttribute("num3", slotService.getSlotService().getNumberThree());
		if (slotService.getSlotService().getNumberOne() == slotService.getSlotService().getNumberTwo()
				&& slotService.getSlotService().getNumberTwo() == slotService.getSlotService().getNumberThree())
			model.addAttribute("won", 1);
		return "slot-machine";
	}

}
