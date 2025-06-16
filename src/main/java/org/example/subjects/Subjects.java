package org.example.subjects;

public abstract class Subjects {
    private String name;
    private int level;
    private int experience;

    private int live;
    private int power;
    private int dexterity;

    public Subjects(String name) {
        this.name = name;
    }

    public Subjects(String name, int level, int experience, int live, int power,
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
        this.live = live;
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
