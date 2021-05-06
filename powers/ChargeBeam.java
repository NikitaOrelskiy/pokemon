package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super (Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        super.applySelfEffects(att);
        if (Math.random() * 100 < 70){
            this.hits += 1;
            att.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }
}
