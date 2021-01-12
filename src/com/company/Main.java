package com.company;

import com.company.io.ConsoleWriter;
import com.company.io.Write;
import com.company.weapons.Knife;
import com.company.weapons.Plasma;
import com.company.weapons.Revolver;
import com.company.weapons.Weapon;

public class Main {

    public static void main(String[] args) {
        Write write = new ConsoleWriter();
        Weapon knife = new Knife(write);
        Weapon revolver = new Revolver(write);
        Weapon plasma = new Plasma(write);
        Player player = new Player(knife,"John");
        player.action();
        player = new Player(revolver,"Mikle");
        player.action();
        player = new Player(plasma,"Ivan");
        player.action();
    }
}
