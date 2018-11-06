package it.unical.asde2018.slot_machine.components.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.components.data.PlayerRepository;
import it.unical.asde2018.slot_machine.model.Credential;
import it.unical.asde2018.slot_machine.model.Player;

@Service
public class LoginService {

	@Autowired
	private PlayerRepository playerRepo;

	public Player findUserWithCredential(Credential credential) {

		List<Player> registeredPlayers = playerRepo.listPlayers();
		Player playerLog = new Player();
		playerLog.setCredentials(credential);
		for (Player player : registeredPlayers) {
			if (player.equals(playerLog)) {
				return player;
			}
		}

		return null;

	}

}
