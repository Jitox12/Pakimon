package Pakimon.Def.controllers;

import Pakimon.Def.dto.PokemonDto.PokemonRequestDto;
import Pakimon.Def.dto.PokemonDto.PokemonResponseDto;
import Pakimon.Def.services.PokemonServiceInterface;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    private final PokemonServiceInterface pokemonServiceInterface;

    public PokemonController(PokemonServiceInterface pokemonServiceInterface) {
        this.pokemonServiceInterface = pokemonServiceInterface;
    }


    @GetMapping(value = "api/find-pokemon/{pokemonId}")
    public PokemonResponseDto findPokemonById(@PathVariable Integer pokemonId){

        return pokemonServiceInterface.findPokemonById(pokemonId);
    }

    @GetMapping(value = "api/find-pokemons")
    public List<PokemonResponseDto> findPokemonsList(){
        return pokemonServiceInterface.getPokemonList();
    }

    @PostMapping(value = "api/create-pokemon")
    @Transactional
    public void createPokemon(@RequestBody PokemonRequestDto pokemonRequestDto){
        pokemonServiceInterface.createPokemon(pokemonRequestDto);


    }

    @PutMapping(value = "api/edit-pokemon/{pokemonId}")
    @Transactional
    public void createPokemon(@PathVariable Integer pokemonId, @RequestBody PokemonRequestDto pokemonRequestDto){
        pokemonServiceInterface.editPokemon(pokemonId, pokemonRequestDto);
    }

}
