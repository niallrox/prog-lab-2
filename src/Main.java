import Moves.AquaTail;
import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pachirisu("Порошенко", 1);
        Pokemon p2 = new Feebas("Зеленский",1);
        Pokemon p3 = new Milotic("Лукашенко", 1);
        Pokemon p4 = new Bounsweet("Трамп",1);
        Pokemon p5 = new Steenee("Байден", 1);
        Pokemon p6 = new Tsareena("Путин",1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p4);
        b.addFoe(p3);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
