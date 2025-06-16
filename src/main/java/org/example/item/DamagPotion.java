package org.example.item;

public class DamagPotion extends Items {

int damage;
    public DamagPotion(String type, String name, int price, int damage) {
        super(type, name, price);
        this.damage = damage;
    }
}
