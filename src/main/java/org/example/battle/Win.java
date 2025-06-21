package org.example.battle;

import org.example.subject.Player;

public class Win {
    Player player;
    public Win(Player player) {
        this.player = player;
    }
    public void giveReward(int xp, int gold) {
        player.setExperience(player.getExperience() + xp);
        player.setGold(player.getGold() + gold);
        System.out.println("Победил " + player.getName() + " получено опыта"
            + xp
            + " получено золото" + gold);

    }

}
