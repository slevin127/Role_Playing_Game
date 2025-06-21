package org.example.battle;

import org.example.subject.Player;

public class Defeat {
    Player player;
    public void defeat(Player player) {
        this.player = player;
        player.setGold(0);

    }
}
