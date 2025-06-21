package org.example.item;

import org.example.battle.UsePotion;
import org.example.subject.Player;

public class DamagePotion extends Item implements UsePotion {

    private int damage;
    public DamagePotion(String type, String name, int price, int damage) {
        super(type, name, price);
        this.damage = damage;
    }
    @Override
    public void use (Player player) {
        player.setPower(player.getPower() + damage);
        System.out.println("Ваша сила увеличилась на " + damage + " ед.");

    }
}
