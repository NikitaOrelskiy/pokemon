package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;


public class SludgeBomb extends PhysicalMove {
    public SludgeBomb(){
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() * 100 < 30){
            Effect.poison(pokemon);
        }
    }
}