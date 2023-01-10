package Pakimon.Def.repositories;

import Pakimon.Def.entities.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<SkillEntity, String> {

    SkillEntity findBySkillId(Integer skillId);
    List<SkillEntity> findAll();
    List<SkillEntity> findBySkillIdIn(List<Integer> skillId);
}
