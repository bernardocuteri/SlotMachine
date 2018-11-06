package it.unical.asde2018.slot_machine.components.models;

public class Bet {
    private int coins = 0;

    public Bet(int coins) {
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
