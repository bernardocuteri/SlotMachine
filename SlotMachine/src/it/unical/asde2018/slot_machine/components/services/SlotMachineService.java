package it.unical.asde2018.slot_machine.components.services;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Player;

@Service
public class SlotMachineService
{
	private int MoltiplicatoreImporto = 9;

	public void gioca(Player player, int puntata)
	{
		// genera 3 numeri random. il gioco è così: fai 3 numeri random, se sono
		// tutti uguali hai vinto, altrimenti hai perso
		if (tentativoGioco())
		{
			player.setSaldo(player.getSaldo() + puntata * MoltiplicatoreImporto);
		} else
		{
			player.setSaldo(player.getSaldo() - puntata);
		}

	}

	// vero = hai vinto, falso hai perso
	private boolean tentativoGioco()
	{

		return true;
	}
}
