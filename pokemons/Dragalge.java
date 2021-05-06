package com.Nikita.pokemons;

import com.Nikita.powers.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dragalge extends Skrelp{
    public Dragalge(String name, int level) {
        super(name, level);
        setStats(65, 75,90, 97, 123, 44);
        setType(Type.POISON, Type.DRAGON);
        setMove(new Thunder());
    }
}
