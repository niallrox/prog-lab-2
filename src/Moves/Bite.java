package Moves;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK,0.6,1.0);
    }

    @Override
    protected String describe() {
        return "Has a 30% chance to make the target flinch.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.chance(0.3);
        effect.flinch(pokemon);
        pokemon.addEffect(effect);
    }
}
