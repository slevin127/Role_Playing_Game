package org.example.subjects;


import org.example.battle.Attack;
import org.example.battle.Healing;
import org.example.move.Move;
import org.example.trading.Trade;

/*
Игрок
 */
public class Player extends Subjects implements Trade, Move, Attack, Healing {
    int gold;
    public Player(String name, int level,
                  int experience,
                  int live, int power, int dexterity) {
        super(name, level, experience, live, power, dexterity);
        this.gold = gold;
    }


    @Override
    public void trade() {

    }

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void heal() {

    }
}
