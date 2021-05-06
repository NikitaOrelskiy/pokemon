package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super (Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() * 100 < 30){
            Effect.paralyze(pokemon);
        }
    }
}