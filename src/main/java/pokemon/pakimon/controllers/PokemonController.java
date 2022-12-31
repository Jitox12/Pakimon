package pokemon.pakimon.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pokemon.pakimon.Entities.PokemonEntity;
import pokemon.pakimon.services.PokemonServiceI;

@RestController
public class PokemonController {

    private final PokemonServiceI pokemonServiceI;

    public PokemonController(PokemonServiceI pokemonServiceI) {
        this.pokemonServiceI = pokemonServiceI;
    }

    @RequestMapping(value="api/pokemon/{poke_num}"  , method = RequestMethod.GET)

    public PokemonEntity getElementsByPokemon(@PathVariable Integer poke_num) throws Exception {

        return pokemonServiceI.findPokemon(poke_num);

    }

}
