package com.company;

import java.util.Random;

public class boss {
    private int bossHealth;
    private  int damage;
    private  int defence;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public void bossChangeDefence(){
        Random r = new Random();
        int a = r.nextInt(17)+1;
        System.out.println(defence + a);

    }
}
