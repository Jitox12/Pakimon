package Pakimon.Def.repositories;

import Pakimon.Def.entities.PokemonSkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonSkillRepository extends JpaRepository<PokemonSkillEntity, String> {
}
