package org.example.battle;

import org.example.subject.Orc;


import java.util.Random;

public class ImpactOrc implements Impact {

private final Orc orc;
Random rand =new Random();

public ImpactOrc(Orc orc) {
    this.orc = orc;

}


    @Override
    public int calculateDamage() {
        int randomNumber = rand.nextInt(100) + 1;
        int critique = (randomNumber <= 20) ? 20 : 0;
        int base = orc.getPower();
        return
            (base * orc.getDexterity() / 100) * critique;
    }
}
