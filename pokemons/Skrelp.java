package com.Nikita.pokemons;

import com.Nikita.powers.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skrelp extends Pokemon {
    public Skrelp(String name, int level){
        super(name, level);
        setStats(50, 60,60, 60, 60, 30);
        setType(Type.POISON, Type.WATER);
        setMove(new FaintAttack(), new Swagger(), new SludgeBomb());
    }
}
