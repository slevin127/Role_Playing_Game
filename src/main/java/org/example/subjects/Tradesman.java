package org.example.subjects;

import org.example.trading.Trade;

public class Tradesman extends Nps implements Trade {
    int gold;
    public Tradesman(String type, String name, int gold) {
        super(type, name, gold);
    }

    @Override
    public void trade() {
        System.out.println("Торговец продал " + "какая то вещ");
    }
}
