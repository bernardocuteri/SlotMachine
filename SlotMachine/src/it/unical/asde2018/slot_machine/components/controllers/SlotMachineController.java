package it.unical.asde2018.slot_machine.components.controllers;

import it.unical.asde2018.slot_machine.components.models.Bet;
import it.unical.asde2018.slot_machine.components.models.Quiz;
import it.unical.asde2018.slot_machine.components.models.User;
import it.unical.asde2018.slot_machine.components.services.GameService;
import it.unical.asde2018.slot_machine.components.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SlotMachineController {

    @Autowired
    private UserService userService;

    @Autowired
    private GameService gameService;

	@GetMapping("/slot-machine")
	public String index(HttpServletRequest request) {
		if (!this.userService.isAuthenticated(request.getSession())) {
			return "redirect:/login";
		}

		return "slot-machine";
	}

	@PostMapping("/slot-machine/play")
	public String play(@ModelAttribute("bet") Bet bet, HttpSession session) {

        if (!this.userService.isAuthenticated(session)) {
            return "redirect:/login";
        }

        User user = this.userService.getAuthenticatedUser(session);

        if (this.userService.hasValidCoins(user, bet)) {
            Quiz quiz = this.gameService.generateQuiz();

            this.userService.updateUserAchievement(session, user, bet, this.gameService.solveQuiz(quiz));
        }

        return "redirect:/slot-machine";
    }
}
