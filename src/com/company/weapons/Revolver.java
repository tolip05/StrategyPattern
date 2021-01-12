package com.company.weapons;

import com.company.io.Write;

public class Revolver implements Weapon {
    private static final String REVOLVER_ATTACK = "Perform revolver attack";
    private Write write;

    public Revolver(Write write) {
        this.write = write;
    }

    @Override
    public void attack() {
        this.write.writeLine(REVOLVER_ATTACK);
    }
}
