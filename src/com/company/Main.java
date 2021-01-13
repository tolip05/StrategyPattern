package com.company;

import com.company.io.ConsoleWriter;
import com.company.io.Write;
import com.company.strategies.Player;
import com.company.strategies.Strategy;
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
        Strategy atackWithKnife = new Player(knife,"John");
        Strategy atckWithRevolver = new Player(revolver,"Mikle");
        Strategy atackWithPlasma = new Player(plasma,"Ivan");
        Context context = new Context(atackWithKnife);
        context.execute();
        context = new Context(atckWithRevolver);
        context.execute();
        context = new Context(atackWithPlasma);
        context.execute();
    }
}
