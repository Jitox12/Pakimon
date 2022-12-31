package pokemon.pakimon.dao;

import pokemon.pakimon.Entities.PokemonEntity;

import java.util.List;

public interface PokemonDao {
    public PokemonEntity elementFindByPokemon(Integer poke_num) throws Exception;

}
