package pokemon.pakimon.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import pokemon.pakimon.Entities.AbilityEntity;
import pokemon.pakimon.Entities.PokemonEntity;

public interface AbilityRepository extends PagingAndSortingRepository<AbilityEntity, String>,
        JpaSpecificationExecutor<AbilityEntity> {

    AbilityEntity findById(Integer ability_id);
}
