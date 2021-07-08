package com.company;

public class Main {

    public static void main(String[] args) {
	hero artur = new hero(100,30,50);
        System.out.println("здоровье артура:"+artur.health);
        System.out.println("урон артура:"+artur.damage);
        System.out.println("урон от суперспосбности:"+artur.power);
        System.out.println("_____________________________________");
        boss b = new boss();
        b.setBossHealth(300);
        b.setDamage(60);
        b.setDefence(50);
        System.out.println("здоровья босса:"+b.getBossHealth());
        System.out.println("урон босса:"+b.getDamage());
        System.out.println("защита босса:"+b.getDefence());
        System.out.print("тип защиты:");b.bossChangeDefence();
    }
}
