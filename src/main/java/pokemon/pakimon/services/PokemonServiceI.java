package pokemon.pakimon.services;

import pokemon.pakimon.Entities.PokemonEntity;

public interface PokemonServiceI {

    public PokemonEntity findPokemon(Integer poke_num) throws Exception;
}
