package com.Nikita.powers;


import ru.ifmo.se.pokemon.*;

public class FaintAttack extends PhysicalMove {
    public FaintAttack(){
        super(Type.DARK, 60, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        this.accuracy = 100;
    }
}
