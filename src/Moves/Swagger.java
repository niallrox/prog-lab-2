package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
    public Swagger(){
        super(Type.NORMAL,0.0,0.85);
    }

    @Override
    protected String describe() {
        return "Raises the target's Attack by two stages and confuses the target.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(-1);
        effect.attack(effect.attack()+2.0);
        pokemon.confuse();
        pokemon.addEffect(effect);
    }
}
