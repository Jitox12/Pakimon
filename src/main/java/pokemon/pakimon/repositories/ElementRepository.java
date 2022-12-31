package pokemon.pakimon.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import pokemon.pakimon.Entities.ElementEntity;
import pokemon.pakimon.Entities.SkillEntity;

public interface ElementRepository extends PagingAndSortingRepository<ElementEntity, String>,
        JpaSpecificationExecutor<ElementEntity> {

    ElementEntity findById(Integer element_id);
}
