package Moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER,0.8,1.0);
    }

    @Override
    protected String describe() {
        return "Has a 30% chance to burn the target.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.chance(0.3);
        effect.burn(pokemon);
        pokemon.addEffect(effect);
    }
}
