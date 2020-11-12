package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends PhysicalMove {
    public Rest(){
        super(Type.PSYCHIC,0.0,0.0);
    }

    @Override
    protected String describe() {
        return "User sleeps for two turns, completely healing itself.";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.turns(2);
        effect.sleep(pokemon);
        effect.stat(Stat.HP,20);
        pokemon.addEffect(effect);
    }
}
