package org.example.subjects;

public abstract class Nps extends Subjects {

    private String type;
    int gold;

    public Nps(String type, String name, int gold) {
        super(name);
        this.type = type;
        this.gold = gold;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
