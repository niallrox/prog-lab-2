package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Swift extends SpecialMove {
    public Swift(){
        super(Type.NORMAL,0.6,0.0);
    }

    @Override
    protected String describe() {
        return "Never misses.";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.attack(1.0);
        pokemon.addEffect(effect);
    }
}
