package org.example.battle;


import org.example.subject.Skeleton;



import java.util.Random;

public class ImpactSkeleton implements Impact {
    private final Skeleton skeleton;
    Random rand = new Random();

    public ImpactSkeleton(Skeleton skeleton) {
        this.skeleton = skeleton;
    }


    @Override
    public int calculateDamage() {
        int randomNumber = rand.nextInt(100) + 1;
        int critique = (randomNumber <= 20) ? 20 : 0;
        int base = skeleton.getPower();
        return
            (base * skeleton.getDexterity() / 100) + critique;


    }
}

