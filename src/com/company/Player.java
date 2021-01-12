package com.company;

import com.company.weapons.Weapon;

public class Player {
    private Weapon weapon;
    private String name;

    public Player(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    public void action(){
        this.weapon.attack();
    }
}
