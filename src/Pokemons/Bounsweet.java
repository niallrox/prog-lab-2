package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name,int level){
        super(name,level);
        setType(Type.GRASS);
        setStats(42,30,38,30,38,32);
        setMove(new Swagger(), new EnergyBall());
    }
}
