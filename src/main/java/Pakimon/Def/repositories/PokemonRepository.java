package Pakimon.Def.repositories;

import Pakimon.Def.entities.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PokemonRepository extends JpaRepository<PokemonEntity, String> {

    PokemonEntity findByPokemonId(Integer pokemonId);
    List<PokemonEntity> findAll();
}
