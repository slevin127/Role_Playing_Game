package org.example.subject;


import org.example.battle.Attack;

import org.example.item.Item;
import org.example.move.Move;
import org.example.trading.Trade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Игрок
 */
public class Player extends Subject implements Trade, Move, Attack {
    int gold;
    private final List<Item> inventory = new ArrayList<Item>(); //инвентарь
    private final Map<String Inetger> resource = new HashMap; /* исчисляемые, и меняющие показатели
    такие как опыт и золото, меняются после каждой битвы
    */

    public Player(String name, int level,
                  int experience,
                  int live, int power,
                  int dexterity, int gold) {
        super(name, level, experience, live, power, dexterity);
        this.gold = gold;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public List<Item> getInventory() {
        return inventory;
    }

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }


    @Override
    public boolean trade(Player buyer, Item item) {
        return false;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
