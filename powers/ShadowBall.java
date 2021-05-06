package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super (Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        if (Math.random() * 100 < 20) {
            def.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }
}

