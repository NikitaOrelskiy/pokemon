package com.Nikita.powers;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Move;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class FurySwipes extends PhysicalMove{
    public FurySwipes(){
        super(Type.NORMAL, 18, 80);
    }

    private int givenList_shouldReturnARandomElement() {
        List<Integer> givenList = Arrays.asList(2, 3, 4, 5);
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
//        Effect e2 = new Effect();
//        e2.chance(3/8).turns(2);
//        e2.chance(3/8).turns(3);
//        e2.chance(1/8).turns(4);
//        e2.chance(1/8).turns(5);
        this.hits = givenList_shouldReturnARandomElement();
    }
}
