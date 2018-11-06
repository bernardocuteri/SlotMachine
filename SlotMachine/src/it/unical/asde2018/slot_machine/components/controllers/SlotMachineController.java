package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.service.SlotService;

@Controller
public class SlotMachineController {
	@Autowired
	SlotService slot;

	@GetMapping("/")
	public String goToSlot(HttpSession session){
		if(session.getAttribute("user")!=null)
			return "slot-machine";
		return "redirect:/login";
	}

	@PostMapping("/")
	public String play(Model model, @RequestParam(required=false) String bet, HttpSession session) {
		String user=(String) session.getAttribute("user");
		if(bet!=null) {
			try {
				if(slot.bet(Integer.parseInt(bet), user))
					model.addAttribute("won",true);
				else
					model.addAttribute("won",false);
				session.setAttribute("credits", slot.getCredits(user));
				model.addAttribute("numbers",slot.getNumbers());
				model.addAttribute("started", true);
			}catch (Exception e) {
				model.addAttribute("finished","not enough credits");
			}
		}else {
			slot.startGame(user);
			session.setAttribute("started", true);
			session.setAttribute("credits", slot.getCredits(user));

		}
		return "slot-machine";
	}

}
