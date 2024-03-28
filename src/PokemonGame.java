import pokemons.Charizard;
import pokemons.Pikachu;
import pokemons.Pokemon;
import pokemons.Squirtle;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard c1 = new Charizard();
        c1.setName("Charizard");
        c1.setHp(150);
        Squirtle s2 = new Squirtle("Squirtle", 70);
        Pikachu p1 = new Pikachu("Pikachu", 50);
        s2.attack(p1);
        p1.attack(s2);
        c1.attack();
        c1.attack(s2);
        c1.attack(p1);
    }
}
