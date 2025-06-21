package org.example.subject;

public abstract class Npc extends Subject {

    private String type;
    int gold;

    public Npc(String type, String name, int gold) {
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
