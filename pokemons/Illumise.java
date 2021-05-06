package com.Nikita.pokemons;

import com.Nikita.powers.ChargeBeam;
import com.Nikita.powers.Charm;
import com.Nikita.powers.ShadowBall;
import com.Nikita.powers.ZenHeadbutt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Illumise extends Pokemon{
    public Illumise(String name, int level){
        super(name, level);
        setStats(65, 47,75, 73, 85, 85);
        setType(Type.BUG);
        setMove(new ChargeBeam(), new ShadowBall(), new Charm(), new ZenHeadbutt());
    }
}
