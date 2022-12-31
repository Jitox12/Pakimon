package pokemon.pakimon.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import pokemon.pakimon.Entities.SkillEntity;

public interface SkillRepository extends PagingAndSortingRepository<SkillEntity, String>,
        JpaSpecificationExecutor<SkillEntity> {

    SkillEntity findById(Integer skill_id);
}
