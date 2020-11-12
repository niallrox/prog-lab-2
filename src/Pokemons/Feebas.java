package Pokemons;

import Moves.Facade;
import Moves.Rest;
import Moves.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Feebas extends Pokemon {
    public Feebas(String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(20,15,20,10,55,80);
        setMove(new Rest(),new Facade(),new Scald());
    }
}
