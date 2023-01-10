package Pakimon.Def.dao;

import Pakimon.Def.dto.PokemonDto.PokemonRequestDto;
import Pakimon.Def.entities.PokemonElementEntity;
import Pakimon.Def.entities.PokemonEntity;
import Pakimon.Def.entities.PokemonSkillEntity;

import java.util.List;

public interface PokemonDao {

    public PokemonEntity findPokemonByIdDao(Integer pokemonId);
    public List<PokemonEntity> getPokemonListDao();
    public void createPokemonDao(PokemonEntity pokemonEntity, PokemonRequestDto pokemonRequestDto);
    public void editPokemonDao(PokemonEntity pokemonEntity);

}
