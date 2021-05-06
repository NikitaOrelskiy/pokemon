package com.Nikita.powers;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends PhysicalMove{
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
}





