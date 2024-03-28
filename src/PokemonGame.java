import pokemons.Pikachu;
import pokemons.Pokemon;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pika1 = new Pikachu("Pikachu", 50);
        Pikachu pika2 = new Pikachu();
        System.out.println(pika1.getName());
        System.out.println(pika1.getHp());
//
//        Pokemon p2 = new Pokemon("Squirtle", 70);
//
//        Pokemon p1 = new Pokemon();
//        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
//        p1.setHp(50);
//        p1.setName("Pikachu");
//        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
//        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");
    }
}
