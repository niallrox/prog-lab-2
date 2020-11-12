package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,0.7,1.0);
    }

    @Override
    protected String describe() {
        return "Power doubles if user is burned, paralyzed, or poisoned.";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        if (pokemon.getCondition().equals(Status.PARALYZE)||pokemon.getCondition().equals(Status.BURN)||pokemon.getCondition().equals(Status.POISON)){
            this.power*=2.0;
        }
        pokemon.addEffect(effect);
    }
}
