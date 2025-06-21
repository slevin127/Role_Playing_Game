package org.example.item;

import org.example.battle.UsePotion;
import org.example.subject.Player;

public class HealingPotion extends Item implements UsePotion {
    private int live;
    public HealingPotion(String type, String name, int price, int live) {
        super(type, name, price);
        this.live = live;

    }

    @Override
    public void use(Player player) {
        player.setLive(player.getLive() + live);
        System.out.println("Вы с легка исцелились, это вам не поможет! ");

    }
}
