package Pokemons;

import Moves.Facade;
import Moves.Rest;
import Moves.Scald;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name,int level){
        super(name,level);
        setType(Type.GRASS);
        setStats(42,30,38,30,38,32);
        setMove(new Swagger());
    }
}
