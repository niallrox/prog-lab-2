package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class HyperFang extends PhysicalMove {
    public HyperFang(){
        super(Type.NORMAL,0.8,0.9);
    }

    @Override
    protected String describe() {
        return "Has a 10% chance to make the target flinch.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.flinch(pokemon);
        pokemon.addEffect(effect);
    }
}
