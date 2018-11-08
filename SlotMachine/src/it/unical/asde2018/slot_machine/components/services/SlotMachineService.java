package it.unical.asde2018.slot_machine.components.services;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.model.SlotMachineNumber;
import it.unical.asde2018.model.Wallet;



@Service
public class SlotMachineService {

	private Wallet wallet;
	
	private SlotMachineNumber slotMachineNumber;
	
	public SlotMachineNumber getSlotMachineNumber() {
		return slotMachineNumber;
	}

	public void setSlotMachineNumber(SlotMachineNumber slotMachineNumber) {
		this.slotMachineNumber = slotMachineNumber;
	}

	private boolean win;
	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	@PostConstruct
	public void init()
	{
		
		wallet=new Wallet(200);
		slotMachineNumber=new SlotMachineNumber();
		slotMachineNumber.generate();
	}
	
	public void bet(int amoutBet)
	{
		if(slotMachineNumber.allNumberEqual())
		{
			wallet.addToWallet(amoutBet*9);
			win=true;
			
		}
		else {
			wallet.removeFromWallet(amoutBet);
			win=false;
		
		}
	}

	public void generateNumber()
	{
		slotMachineNumber.generate();
	}
	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public SlotMachineNumber getNumbers() {
		return slotMachineNumber;
	}

	public void setNumbers(SlotMachineNumber numbers) {
		this.slotMachineNumber = numbers;
	}
}
