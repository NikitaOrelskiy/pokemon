package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.*;

public class Swagger extends PhysicalMove {
    public Swagger(){
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setLevel(def.getLevel()+2);
        def.confuse();
    }
}