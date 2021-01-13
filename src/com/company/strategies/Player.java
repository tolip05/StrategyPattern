package com.company.strategies;

import com.company.strategies.Strategy;
import com.company.weapons.Weapon;

public class Player implements Strategy {
    private Weapon weapon;
    private String name;

    public Player(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    @Override
    public void fight() {
        this.weapon.attack();
    }
}
