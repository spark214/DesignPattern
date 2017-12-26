package StrategyPattern;

import java.lang.*;

/**
 * Created by Toz Lam  on 2017/10/14.
 */
public class Queen extends Character {
    public  Queen(){
        weaponBehavior=new KnifeWeapon();
    }

    void display(){
        System.out.println("皇后：");
    }
}
