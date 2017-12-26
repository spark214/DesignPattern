package StrategyPattern;

import java.lang.*;

/**
 * Created by Toz Lam  on 2017/10/14.
 */
public class King extends Character {
    public King(){
        weaponBehavior=new AxeWeapon();
    }
    void display(){
        System.out.println("国王：");
    }
}
