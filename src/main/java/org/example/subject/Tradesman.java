package org.example.subject;

import org.example.item.Item;
import org.example.trading.Trade;


import java.util.ArrayList;
import java.util.List;


public class Tradesman extends Npc implements Trade {

    private final List<Item> inventory = new ArrayList<>();

    public Tradesman(String type, String name, int gold) {
        super(type, name, gold);

    }

    public void add(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public List<Item> getInventory() {
        return inventory;
    }

    @Override
    public boolean trade(Player buyer, Item item) {
        if (!inventory.contains(item))
            return false;
        if (buyer.getGold() < item.getPrice())
            return false;
        System.out.println("Недостаточно золота");

        buyer.setGold(buyer.getGold() - item.getPrice());
        setGold(getGold() + item.getPrice());
        removeItem(item);
        buyer.addItem(item);
        return true;
    }
}
