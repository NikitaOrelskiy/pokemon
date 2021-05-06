package com.Nikita.pokemons;


import com.Nikita.powers.*;
import ru.ifmo.se.pokemon.*;

import java.awt.*;

public class Slaking extends Vigoroth{

    public Slaking(String name, int level) {
        super(name, level);
        setStats(150, 160,100, 95, 65, 100);
        setType(Type.NORMAL);
        setMove(new SlackOff());
    }
}


