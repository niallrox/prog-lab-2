package Pokemons;

import Moves.Bite;
import Moves.HyperFang;
import Moves.Rest;
import Moves.Swift;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pachirisu extends Pokemon {
    public Pachirisu(String name, int level){
        super(name,level);
        setType(Type.POISON);
        setStats(60,45,70,45,90,95);
        setMove(new Rest(),new Bite(),new Swift(),new HyperFang());
    }
}
