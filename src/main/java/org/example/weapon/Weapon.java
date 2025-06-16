package org.example.weapon;

import org.example.item.Items;

public abstract class Weapon extends Items {

    private byte damage;

    private int durability;

    public Weapon(String type, String name, byte damage, int price, int durability) {

     super(type, name, price);
        this.damage = damage;
        this.durability = durability;
    }


    public abstract boolean doDamage();

    public abstract boolean criticDamage();

    public boolean isBroken() {
        return durability <= 0;
    }


    public byte getDamage() {
        return damage;
    }

    public void setDamage(byte damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
