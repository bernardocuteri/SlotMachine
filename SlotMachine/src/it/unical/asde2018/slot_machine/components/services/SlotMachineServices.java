package it.unical.asde2018.slot_machine.components.services;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.slot_machine.model.Match;

@Service
public class SlotMachineServices
{

	private Match match;

	@PostConstruct
	public void init()
	{
		startNewMatch();
	}

	public Match getMatch()
	{
		return match;
	}

	public void startNewMatch()
	{
		match = new Match();
	}

}
