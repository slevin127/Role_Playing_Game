package org.example.subject;

public class Skeleton extends Subject {
     int gold;

    public Skeleton(String name, int level,
                    int experience, int live,
                    int power, int dexterity, int gold) {
        super(name, level, experience, live, power, dexterity);
        this.gold = gold;
    }
}
