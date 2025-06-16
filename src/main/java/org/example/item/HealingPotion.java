package org.example.item;

public class HealingPotion extends Items {
    int live;
    public HealingPotion(String type, String name, int price, int live) {
        super(type, name, price);
        this.live = live;

    }
}
