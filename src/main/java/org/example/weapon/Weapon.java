package org.example.weapon;

public abstract class Weapon {
    private String type;
    private String name;
    private byte damage;
    private int price;
    private int durability;

    public Weapon(String type, String name, byte damage, int price, int durability) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.durability = durability;
    }


    public abstract boolean doDamage();

    public abstract boolean criticDamage();

    public boolean isBroken() {
        return durability <= 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getDamage() {
        return damage;
    }

    public void setDamage(byte damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
