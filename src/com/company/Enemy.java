package com.company;

public class Enemy {
    private int helth;
    private int attack;
    private int possibleExpDrop;

    public int getPossibleExpDrop() {
        return possibleExpDrop;
    }

    public void setPossibleExpDrop(int possibleExpDrop) {
        this.possibleExpDrop = possibleExpDrop;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
