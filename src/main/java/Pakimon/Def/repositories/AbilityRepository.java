package Pakimon.Def.repositories;

import Pakimon.Def.entities.AbilityEntity;
import Pakimon.Def.entities.ElementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AbilityRepository extends JpaRepository<AbilityEntity, String> {

    AbilityEntity findByAbilityId(Integer abilityId);
    List<AbilityEntity> findAll();
    List<AbilityEntity> findByAbilityIdIn(List<Integer> abilitiesId);

}
