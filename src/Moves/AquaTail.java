package Moves;

import ru.ifmo.se.pokemon.*;

public class AquaTail extends PhysicalMove {
    public AquaTail(){
        super(Type.DRAGON,0.6,0.9);
    }

    @Override
    protected String describe() {
        return "Inflicts regular damage with no additional effect.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(-1);
        effect.stat(Stat.HP, - (int) (pokemon.getHP()*0.05));
        pokemon.setCondition(effect);
        pokemon.addEffect(effect);
    }
}
