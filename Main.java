package com.Nikita;

import com.Nikita.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Slakoth p1 = new Slakoth("Lol", 1);
        Illumise p2 = new Illumise("Predator", 1);
        Dragalge p3 = new Dragalge("Friend", 1);
        Slaking p4 = new Slaking("Warrior", 1);
        Vigoroth p5 = new Vigoroth("Homie", 1);
        Skrelp p6 = new Skrelp("SemiGod", 1);

        b.addAlly(p2);
        b.addFoe(p1);
        b.addAlly(p4);
        b.addFoe(p3);
        b.addAlly(p6);
        b.addFoe(p5);
        b.go();
    }
}
