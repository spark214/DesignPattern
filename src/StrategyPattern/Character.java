package StrategyPattern;

/**
 * Created by Toz Lam  on 2017/10/14.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    abstract void display();

    public void useWeapon() {
        weaponBehavior.weapon();
    }


}
