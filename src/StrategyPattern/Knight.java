package StrategyPattern;

import java.lang.*;

/**
 * Created by Toz Lam  on 2017/10/14.
 */
public class Knight extends Character {
    public  Knight(){
        weaponBehavior=new SwordWeapon();
    }

    void display(){
        System.out.println("骑士：");    }
}
