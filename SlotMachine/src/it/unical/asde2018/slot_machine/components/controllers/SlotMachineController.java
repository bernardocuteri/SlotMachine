package it.unical.asde2018.slot_machine.components.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;
import it.unical.asde2018.slot_machine.model.UserGame;

@Controller
public class SlotMachineController {

	@Autowired
	private SlotMachineService slotMachineService;

	@PostMapping("/game")
	public String bet(HttpSession session, @RequestParam String bet_quantity) {
		int bet = Integer.parseInt(bet_quantity);
		List<Integer> results = slotMachineService.generateRandomArray();
		UserGame userGame = (UserGame) session.getAttribute("userGame");
		userGame.setCoins(userGame.getCoins() - bet);
		userGame.setLastResults(results);
		userGame.setLastBet(bet);
		if (slotMachineService.isWin()) {
			userGame.setCoins(userGame.getCoins() + (bet * 9));
		}
		userGame.setLastBetIsWin(slotMachineService.isWin());
		// System.out.println(results + ",, " + slotMachineService.isWin());
		session.setAttribute("userGame", userGame);
		return "slot-machine";
	}

	@GetMapping("/game")
	public String game(HttpSession session) {
		UserGame userGame = (UserGame) session.getAttribute("userGame");
		// if (userGame == null) {
		// userGame = new UserGame(UserGame.INITIAL_COINS);
		// }
		session.setAttribute("userGame", userGame);
		return "slot-machine";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@PostMapping("/home")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
