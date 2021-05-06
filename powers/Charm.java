package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.*;

public class Charm extends SpecialMove {
    public Charm() {
        super (Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(ATTACK, -2);
    }
}

