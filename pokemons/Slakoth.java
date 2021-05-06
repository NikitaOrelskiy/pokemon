package com.Nikita.pokemons;

import com.Nikita.powers.DoubleTeam;
import com.Nikita.powers.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level){
        super(name, level);
        setStats(60, 60,60, 35, 35, 30);
        setType(Type.NORMAL);
        setMove(new Facade(), new DoubleTeam());
    }
}
