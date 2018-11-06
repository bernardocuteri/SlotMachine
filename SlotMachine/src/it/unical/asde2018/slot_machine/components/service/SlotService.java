package it.unical.asde2018.slot_machine.components.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SlotService {
	HashMap<String, Integer> credits;
	private int n1,n2,n3;

	public boolean bet(int pay,String user) throws Exception {
		if(credits.get(user)<pay)
			throw new Exception();

		credits.put(user, credits.get(user)-pay);

		n1=new Random().nextInt(3);
		n2=new Random().nextInt(3);
		n3=new Random().nextInt(3);

		if(n1==n2 && n2==n3) {
			credits.put(user, credits.get(user)+(pay*9));
			return true;
		}
		return false;
	}
	public int getCredits(String user) {
		return credits.get(user);
	}

	public List<Integer> getNumbers(){
		List<Integer> l=new ArrayList<>();
		l.add(n1);
		l.add(n2);
		l.add(n3);
		return l;
	}


	@PostConstruct
	private void init() {
		credits=new HashMap<>();
	}

	public void startGame(String user){
		System.out.println(user);
		credits.put(user, 200);
	}
}
