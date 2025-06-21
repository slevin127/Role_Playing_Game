package org.example.item;

import org.example.battle.UsePotion;
import org.example.subject.Player;

public class DexterityPotion extends Item implements UsePotion {

    private int dexterity;
    public DexterityPotion(String type, String name, int price, int dexterity) {
        super(type, name, price);
        this.dexterity = dexterity;
    }

    @Override
    public void use(Player player) {
        player.setDexterity(player.getDexterity() + dexterity);
        System.out.println("Ваша ловкость увеличилась на " + dexterity + "10ед.");


    }
}
