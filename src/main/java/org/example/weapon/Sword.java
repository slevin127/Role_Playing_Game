package org.example.weapon;

public class Sword extends Weapon{
    public Sword(String type, String name, byte damage,
               int price, int durability ) {
        super(type, name, damage, price, durability);
    }

        @Override
        public boolean doDamage () {
            return false;
        }

        @Override
        public boolean criticDamage () {
            return false;
        }

}
