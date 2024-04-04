package pokemons;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
    }

    public Charizard() {

    }

    @Override
    public void attack() {
        System.out.println("Wide area fire attack~");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName() + " fires a flamethrower attack at "+ targetPokemon.getName() +".");
    }
}
