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
    int exp=0, dmgLvl=1, helth=100, speed=20, aids=0, gold=0; // ;)
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
        helth = helth-(enemy.getAttack()+(int)(Math.random()*5+1));
    }

    void kill() {
        exp+=enemy.getPossibleExpDrop()*(Math.random()*10+1);
    }

    void defence() {
        helth = helth-((enemy.getAttack()+(int)(Math.random()*5+1))/item.getDefense());
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
        helth=100;
        speed=20;
    }

    void drop(String carryingItem) {
        items.remove(carryingItem);
        speed+=10;
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
