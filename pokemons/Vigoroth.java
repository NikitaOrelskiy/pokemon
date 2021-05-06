package com.Nikita.pokemons;

import com.Nikita.powers.*;
import ru.ifmo.se.pokemon.*;

import java.awt.*;

public class Vigoroth extends Slakoth{

    public Vigoroth(String name, int level) {
        super(name, level);
        setStats(80, 80,80, 55, 55, 90);
        setType(Type.NORMAL);
        setMove(new FurySwipes());
    }
}
