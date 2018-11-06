package it.unical.asde2018.slot_machine.components.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {

	private boolean isWin = false;

	public List<Integer> generateRandomArray() {
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		Random random = new Random();

		int tmp = -1;
		isWin = true;
		for (int i = 0; i < 3; i++) {
			int r = random.nextInt(3);
			if (i == 0)
				tmp = r;
			else if (r != tmp)
				isWin = false;
			list.add(r);
		}
		return list;
	}

	public boolean isWin() {
		return isWin;
	}

	public void setWin(boolean isWin) {
		this.isWin = isWin;
	}
}
