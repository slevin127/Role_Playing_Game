package org.example.weapon;

public class Axe extends Weapon {
    public Axe(String type, String name, byte damage,
               int price, int durability) {
        super(type, name, damage, price, durability);

    }

    @Override
    public boolean doDamage() {
        if (isBroken())
            return false;
        reduceDurability(1);
        return true;
    }

    @Override
    public boolean criticDamage() {
        return false;
    }
}
