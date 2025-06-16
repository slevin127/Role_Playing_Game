package org.example.subjects;


import org.example.battle.Attack;
import org.example.battle.Healing;
import org.example.item.Items;
import org.example.move.Move;
import org.example.trading.Trade;

import java.util.ArrayList;
import java.util.List;

/*
Игрок
 */
public class Player extends Subjects implements Trade, Move, Attack, Healing {
    int gold;
    private final List<Items> inventory = new ArrayList<Items>();

    public Player(String name, int level,
                  int experience,
                  int live, int power,
                  int dexterity, int gold) {
        super(name, level, experience, live, power, dexterity);
        this.gold = gold;
    }

    public void addItem(Items item) {
        inventory.add(item);
    }

    public List<Items> getInventory() {
        return inventory;
    }

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void heal() {

    }

    @Override
    public boolean trade(Player buyer, Items item) {
        return false;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
