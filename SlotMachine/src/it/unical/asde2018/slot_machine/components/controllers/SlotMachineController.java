package it.unical.asde2018.slot_machine.components.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SlotMachineController {

	@GetMapping("/")
	public String goToIndex(Model model, HttpSession session) {
		if (session.getAttribute("user") != null) {
			return "slot-machine";
		}
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	@GetMapping("/playSlot")
	public String play(HttpSession session , @RequestParam String bet, Model model) {
		int betsum = Integer.parseInt(bet);
		int actualCoins = (int) session.getAttribute("coins");
		if( (betsum==5 || betsum==10 || betsum==20) && actualCoins - betsum>=0) {
			session.setAttribute("coins", actualCoins - betsum);
			System.out.println("Entrato in Play");
			Random rand = new Random();
			int[] numbers = new int[] {0,0,0};
			numbers[0] = rand.nextInt(2);
			numbers[1] = rand.nextInt(2);
			numbers[2] = rand.nextInt(2);
			for (int i = 0; i < 3; i++) {
				System.out.println("numbers["+i+"]= "+numbers[i]);
			}
			if(numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
				System.out.println("ARE EQUALS");
				model.addAttribute("win", true);
				session.setAttribute("coins", (actualCoins - betsum)+(betsum*9 ));
				model.addAttribute("win_msg", "FANTASTIC!! You won "+betsum*9+" coins. ");
			}
			return "slot-machine";
		}
		if(actualCoins - betsum < 0) {
			model.addAttribute("error", "YOU HAVE NO MORE COINS");
		}else {
			model.addAttribute("error", "Wrong bet! It can be only 5, 10 or 20 coins");
		}
		return "slot-machine";
	}
	
}
