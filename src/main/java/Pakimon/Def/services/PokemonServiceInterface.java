package Pakimon.Def.services;

import Pakimon.Def.dto.PokemonDto.PokemonRequestDto;
import Pakimon.Def.dto.PokemonDto.PokemonResponseDto;
import Pakimon.Def.dto.skillDto.SkillRequestDto;
import Pakimon.Def.dto.skillDto.SkillResponseDto;

import java.util.List;

public interface PokemonServiceInterface {

    public PokemonResponseDto findPokemonById(Integer pokemonId);
    public List<PokemonResponseDto> getPokemonList();
    public void createPokemon(PokemonRequestDto pokemonRequestDto);
    public void editPokemon(Integer pokemon_id, PokemonRequestDto pokemonRequestDto);
}
