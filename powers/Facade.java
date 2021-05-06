package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        if(pokemon.getCondition() == Status.BURN | pokemon.getCondition() == Status.POISON | pokemon.getCondition() == Status.PARALYZE){
            this.power *= 2;
        }
    }
}
