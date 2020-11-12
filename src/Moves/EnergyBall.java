package Moves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS,0.9,1.0);
    }

    @Override
    protected String describe() {
        return "Has a 10% chance to lower the target's Special Defense by one stage.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.chance(0.1);
        pokemon.setStats(pokemon.getHP(),pokemon.getStat(Stat.ATTACK),pokemon.getStat(Stat.DEFENSE),pokemon.getStat(Stat.SPECIAL_ATTACK),pokemon.getStat(Stat.SPECIAL_DEFENSE)-1,pokemon.getStat(Stat.SPEED));
        pokemon.addEffect(effect);
    }
}
