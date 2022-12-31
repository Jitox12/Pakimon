package pokemon.pakimon.services;

import org.springframework.stereotype.Service;
import pokemon.pakimon.Entities.PokemonEntity;
import pokemon.pakimon.dao.PokemonDao;

@Service
public class PokemonService implements PokemonServiceI{

    private final PokemonDao pokemonDao;

    public PokemonService(PokemonDao pokemonDao) {
        this.pokemonDao = pokemonDao;
    }

    @Override
    public PokemonEntity findPokemon(Integer poke_num) throws Exception {

        return pokemonDao.elementFindByPokemon(poke_num);
    }
}
