package StrategyPattern;

import java.util.Queue;

/**
 * Created by Toz Lam  on 2017/10/14.
 */
public class Test {
    public static void main(String[] args){
        King king=new King();
        king.display();
        king.useWeapon();
        System.out.println("我要更换武器！");
        king.setWeapon(new SwordWeapon());
        king.useWeapon();
        System.out.println("--------------------------------------------------");
        Queen queen=new Queen();
        queen.display();
        queen.useWeapon();
        System.out.println("我要更换武器！");
        queen.setWeapon(new ArrowWeapon());
        queen.useWeapon();
        System.out.println("--------------------------------------------------");
        Knight knight=new Knight();
        knight.display();
        knight.useWeapon();
        System.out.println("我要更换武器！");
        knight.setWeapon(new AxeWeapon());
        knight.useWeapon();
        System.out.println("--------------------------------------------------");
        Troll troll=new Troll();
        troll.display();
        troll.useWeapon();
        System.out.println("我要更换武器！");
        troll.setWeapon(new KnifeWeapon());
        troll.useWeapon();
    }
}
