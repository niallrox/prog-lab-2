package Pokemons;

import Moves.AquaTail;
import Moves.Facade;
import Moves.Rest;
import Moves.Scald;
import ru.ifmo.se.pokemon.Type;

public class Milotic extends Feebas {
    public Milotic(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(95,60,79,100,125,81);
        setMove(new Rest(),new Facade(),new Scald(),new AquaTail());
    }
}
