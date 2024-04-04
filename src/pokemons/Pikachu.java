package pokemons;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika Pika~");
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 15;
        this.skills[0] = "cheeks bulging";
        this.skills[1] = "electric shock";
        this.skills[2] = "100,000 volts";
        this.skillPoints[0] = 20;
        this.skillPoints[1] = 40;
        this.skillPoints[2] = 90;
        System.out.println("Pika Pika~");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Electric");
    }

    @Override
    public void attack() {
        System.out.println("Wide area lightning attack~");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {  // LSP
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints[s]));
        System.out.println(this.getName() + " makes a lightning attack at " + targetPokemon.getName() + ".");
        System.out.println("The health of the wild Pokémon " + targetPokemon.getName() +" was reduced to "+ targetPokemon.getHp() +" due to " + this.getName() +"'s attack.");
    }
}
