import Moves.AquaTail;
import Pokemons.Feebas;
import Pokemons.Milotic;
import Pokemons.Pachirisu;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Milotic("Лох водный", 100000);
        Pokemon p2 = new Pachirisu("Крутой",100000);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
