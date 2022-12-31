package pokemon.pakimon.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import pokemon.pakimon.Entities.PokemonEntity;

public interface PokemonRespository extends PagingAndSortingRepository<PokemonEntity, String>,
        JpaSpecificationExecutor<PokemonEntity> {

    PokemonEntity findById(Integer poke_num);
}

