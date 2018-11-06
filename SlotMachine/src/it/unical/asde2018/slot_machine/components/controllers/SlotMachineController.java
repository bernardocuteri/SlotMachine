package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.slot_machine.components.services.SlotMachineService;
import it.unical.asde2018.slot_machine.model.Player;

@Controller
public class SlotMachineController
{

	@Autowired
	private SlotMachineService slotMachine;

	@GetMapping("slotMachine")
	public String goToIndex(Model model, HttpSession session)
	{
		// Facciamo una classe player, mettiamo il player nella sessione
		// altrimenti non possiamo gestirlo dall'altro metodo, penso,
		// vedi un po' tu, mi sento un po' confuso ahahahha perche nn possiamo
		// gestirlo scuASA ?

		Player player = new Player(200, (String) session.getAttribute("user"));

		// inseriamo il player nella pagina web così l'utente può visualizzare
		// il suo saldo corrente,

		model.addAttribute("player", player);
		session.setAttribute("player", player);
		return "slot-machine";

	}

	// facciamo un metodo gioca: che prende come parametro la puntata del
	// giocatore (5,10,20) e che chiama la slotmachine per fare la giocata

	@GetMapping("gioca")
	public String gioca(@RequestParam String puntata, Model model, HttpSession session)
	{
		// qui dovremmo far riferimento allo stesso player che sta visitando il

		// 1 prova a giocare
		// 2 se hai vinto moltiplica per 9 la puntata e incrementa il saldo
		// 3 se hai perso togli la puntata dal saldo

		// quindi prendi il player, fai la giocata, aggiorna il player, dovrebbe

		Player player = (Player) session.getAttribute("player");

		slotMachine.gioca(player, Integer.parseInt(puntata));

		session.setAttribute("player", player);

		model.addAttribute("player", player);
		return "slot-machine";

	}
}
