package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.*;

public class ZenHeadbutt extends SpecialMove {
    public ZenHeadbutt() {
        super (Type.PSYCHIC, 80, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        super.applyOppEffects(def);
        if (Math.random() * 100 < 20){
            Effect.flinch(def);
        }
    }
}

