package it.unical.asde2018.slot_machine.components.services;

import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class SlotMachinesService{
    public int coins;

    @PostConstruct
    public void init(){
        coins = 200;
    }

    public int getCoins(){
        return coins;
    }

    public void setCoins(int coins){
        this.coins = coins;
    }

    public boolean hadMoney(){
        return coins > 5;
    }

    public int generateRandomNumber(){
        return new Random().nextInt(3);
    }

    public void increaseCoin(int m){
        coins += m;
    }

    public void decreaseCoin(int m){
        coins -= m;
    }

    public String checkWin(int a,int b,int c,int bet){
        if (a == b && a == c) {
            int sum = bet * 9;
            increaseCoin(sum);
            return "Congrats, you win " + sum;
        }
        decreaseCoin(bet);
        return "Sorry, you lose " + bet;
    }
}
