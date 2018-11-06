package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import it.unical.asde2018.slot_machine.model.Number;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {

	private List<Number> allRandomNumber;
	private Number numero;
	private Number numero1;
	private Number numero2;

	@PostConstruct
	public void init() {
		setAllRandomNumber(new ArrayList<>());
		numero = new Number(new Random().nextInt(50));
		numero1 = new Number(new Random().nextInt(50));
		numero2 = new Number(new Random().nextInt(50));
		getAllRandomNumber().add(numero);
		getAllRandomNumber().add(numero1);
		getAllRandomNumber().add(numero2);
	}

	public List<Number> getAllRandomNumber() {
		return allRandomNumber;
	}

	public void setAllRandomNumber(List<Number> allRandomNumber) {
		this.allRandomNumber = allRandomNumber;
	}
}
