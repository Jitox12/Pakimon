package Pakimon.Def.repositories;

import Pakimon.Def.entities.PokemonElementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonElementRepository extends JpaRepository<PokemonElementEntity, String> {
}
