package com.company.weapons;

import com.company.io.Write;

public class Knife implements Weapon {
    private static final String KNIFE_ATTACK = "Perform knife attack";
    private Write write;

    public Knife(Write write) {
        this.write = write;
    }

    @Override
    public void attack() {
      this.write.writeLine(KNIFE_ATTACK);
    }
}
