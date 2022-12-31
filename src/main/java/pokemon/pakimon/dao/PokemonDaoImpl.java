package pokemon.pakimon.dao;

import org.springframework.stereotype.Component;
import pokemon.pakimon.Entities.PokemonEntity;
import pokemon.pakimon.repositories.PokemonRespository;

import java.util.Objects;
import java.util.Optional;

@Component
public class PokemonDaoImpl implements PokemonDao {

    private final PokemonRespository pokemonRespository;

    public PokemonDaoImpl(PokemonRespository pokemonRespository) {
        this.pokemonRespository = pokemonRespository;
    }

    @Override
    public PokemonEntity elementFindByPokemon(Integer poke_num) throws Exception {

        PokemonEntity pokemonOptional = pokemonRespository.findById(poke_num);

        if(Objects.isNull(pokemonOptional)){
            throw new Exception();
        }
        return pokemonOptional;
    }
}