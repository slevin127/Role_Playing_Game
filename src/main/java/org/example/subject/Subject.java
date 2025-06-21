package org.example.subject;

public abstract class Subject {
    private String name;
    private int level;
    private int experience;

    private int live;
    private int power;
    private int dexterity;

    public Subject(String name) {
        this.name = name;
    }

    public Subject(String name, int level, int experience, int live, int power,
                   int dexterity) {
        this.name = name;
        this.level = level;
        this.experience = experience;

        this.live = live;
        this.power = power;
        this.dexterity = dexterity;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        if (live <= 0) {
            this.live = 0;
            System.out.println(this.getName() + " погиб.");
        } else if (live > 100) {
            this.live = 100;
        } else {
            this.live = live;
        }

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
