package StrategyPattern;

import java.lang.*;

/**
 * Created by Toz Lam  on 2017/10/14.
 */
public class Troll extends Character {
    public Troll(){
        weaponBehavior=new ArrowWeapon();
    }
    void display(){
        System.out.println("妖怪：");
    }
}
