package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.*;

public class SlackOff extends PhysicalMove {
    public SlackOff(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.setStats(pokemon.getHP()*2, pokemon.getStat(ATTACK), pokemon.getStat(DEFENSE), pokemon.getStat(SPEED), pokemon.getStat(SPECIAL_ATTACK),pokemon.getStat(SPECIAL_DEFENSE));

        //e2.stat(HP) = (int) (pokemon.getHP() * 2);
        //double st = pokemon.getHP() * 2;

    }
}
