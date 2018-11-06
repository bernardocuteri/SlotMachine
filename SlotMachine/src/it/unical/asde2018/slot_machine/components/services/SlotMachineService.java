package it.unical.asde2018.slot_machine.components.services;

import java.util.HashMap;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Game;
import it.unical.asde2018.slot_machine.model.Player;

@Service
public class SlotMachineService {
//	HashMap<Player, Game> games;
	
//	@PostConstruct
//	public void init() {
////		games = new HashMap<>();
//	}

//	public Game createGame(Player p) {
//		Game g = new Game();
//		games.put(p, g);
//		return g;
//	}
	public Game bet(Player p, int bet) {
		Game g= new Game();
		g.random();
		if(!g.allEquals())
			p.setCoin(p.getCoin()-bet);
		else 
			p.setCoin(p.getCoin()+(9*bet));
		return g;
	}

}
