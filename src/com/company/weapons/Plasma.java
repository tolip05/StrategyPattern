package com.company.weapons;

import com.company.io.Write;

public class Plasma implements Weapon {
    private static final String PLASMA_ATTACK = "Perform plasma gun attack";
    private Write write;

    public Plasma(Write write) {
        this.write = write;
    }

    @Override
    public void attack() {
        this.write.writeLine(PLASMA_ATTACK);
    }
}
