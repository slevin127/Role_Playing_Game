package org.example.subjects;

import org.example.item.Items;
import org.example.trading.Trade;


import java.util.ArrayList;
import java.util.List;


public class Tradesman extends Nps implements Trade {
    private int gold;
    private final List<Items> inventory = new ArrayList<>();

    public Tradesman(String type, String name, int gold) {
        super(type, name, gold);

    }

    public void add(Items item) {
        inventory.add(item);
    }

    public void removeItem(Items item) {
        inventory.remove(item);
    }

    public List<Items> getInventory() {
        return inventory;
    }

    @Override
    public boolean trade(Player buyer, Items item) {
        if (!inventory.contains(item))
            return false;
        if (buyer.getGold() < item.getPrice())
            return false;
        buyer.setGold(buyer.getGold() - item.getPrice());
        this.gold += item.getPrice();
        removeItem(item);
        buyer.addItem(item);
        return true;
    }
}
