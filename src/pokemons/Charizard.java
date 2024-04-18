package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
//        this.skills = new String[]{"claw", "dragon's breath", "flare drive"};
//        this.skillPoints = new Integer[]{20, 40, 90};

        this.skills = new ArrayList<>(Arrays.asList("claw", "dragon's breath", "flare drive"));
        this.skillPoints = new ArrayList<>(Arrays.asList(20, 40, 90));

        System.out.println("Riza~~");
    }

    public Charizard() {
        System.out.println("Riza~~");
    }

    @Override
    public void attack() {
        System.out.println("Wide area fire attack~");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {  // LSP
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(s)));
        System.out.println(this.getName() + " fires a "+ this.skills.get(s) +" attack at "+ targetPokemon.getName() +".");
        System.out.println("The health of the wild Pokémon " + targetPokemon.getName() +" was reduced to "+ targetPokemon.getHp() +" due to " + this.getName() +"'s attack.");
    }
}
