package com.company;
//1. Конструкторы
//        2. Поля характеристики (например, experience, damageLevel, health, speed, type,
//        abilities[], items[], gold, class Location({x, y, z}))
//        3. Getter, setter, toString(), equals()
//        4. Методы (например, buy(), attack(), kill(), defense(), carry(), respawn(), move())
//        5. Тривиальное взаимодействие 2-x игроков в основной программе c помощью
//        Random сhoice, хранение в виде массива

import java.util.ArrayList;

public class Hero {
    private int exp=0, dmgLvl=1, health =100, speed=20, aids=0, gold=0; // ;)
    // (если ты жто прочёл то ты этим^ заражён, перешли это другу и избавься от этого)
    Item item = new Item();
    Enemy enemy = new Enemy();
    String[] abilities;
    ArrayList<String> items;

    void buy() {
        int moneySpent=0;
        //покупка
        String boughtItem = "";
        items.add(boughtItem);
        gold-=moneySpent;
    }

    void attack() {
        enemy.setHelth(enemy.getHelth()-(item.getDamage()*dmgLvl+(int)(Math.random()*10+1)));
        health = health -(enemy.getAttack()+(int)(Math.random()*5+1));
        checkHealth();
    }

    void kill() {
        exp+=enemy.getPossibleExpDrop()*(Math.random()*10+1);
    }

    void defence() {
        health = health -((enemy.getAttack()+(int)(Math.random()*5+1))/item.getDefense());
        checkHealth();
    }

    void carry(String carryingItem) {
        items.add(carryingItem);
        speed-=10;
    }

    void respawn() {
        items.clear();
        gold = 0;
        aids = 10;
        exp=0;
        dmgLvl=1;
        health =100;
        speed=20;
    }

    void drop(String carryingItem) {
        items.remove(carryingItem);
        speed+=10;
    }

    void checkHealth() {
        if (health <=0) {
            respawn();
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getDmgLvl() {
        return dmgLvl;
    }

    public void setDmgLvl(int dmgLvl) {
        this.dmgLvl = dmgLvl;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAids() {
        return aids;
    }

    public void setAids(int aids) {
        this.aids = aids;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
class Location {
    double x;
    double y;
    double z;

    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
