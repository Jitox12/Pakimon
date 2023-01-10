package Pakimon.Def.repositories;

import Pakimon.Def.entities.PokemonAbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonAbilityRepository extends JpaRepository<PokemonAbilityEntity, String> {
}
