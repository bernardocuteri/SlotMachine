package it.unical.asde2018.slot_machine.components.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import it.unical.asde2018.slot_machine.model.Credential;
import it.unical.asde2018.slot_machine.model.Player;

@Repository
public class PlayerRepository {

	public List<Player> registeredPlayers = new ArrayList<Player>();

	@PostConstruct
	public void init() {

		// HARDCODE PLAYERS
		Player player1 = new Player("Tony Perez", new Credential("tony", "perez"), 200);
		registeredPlayers.add(player1);
		Player player2 = new Player("Luis Tian", new Credential("luis", "tian"), 200);
		registeredPlayers.add(player2);
	}

	public List<Player> listPlayers() {
		return registeredPlayers;
	}

}
