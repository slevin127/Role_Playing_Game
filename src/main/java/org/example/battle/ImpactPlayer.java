package org.example.battle;


import org.example.subject.Player;

import org.example.weapon.Weapon;

public class ImpactPlayer implements Impact {

    private final Player player;
    private final Weapon weapon;


    public ImpactPlayer(Player player, Weapon weapon) {
        this.player = player;
        this.weapon = weapon;

    }

    @Override
    public int calculateDamage() {
        int base = player.getPower();
        if (weapon != null) base += weapon.getDamage();
        return base * player.getDexterity() / 100;


    }
}
