package Pakimon.Def.services;

import Pakimon.Def.dao.PokemonDao;
import Pakimon.Def.dto.PokemonDto.PokemonDto;
import Pakimon.Def.dto.PokemonDto.PokemonRequestDto;
import Pakimon.Def.dto.PokemonDto.PokemonResponseDto;
import Pakimon.Def.mapper.pokemonMapper.PokemonRequestMapper;
import Pakimon.Def.mapper.pokemonMapper.PokemonResponseMapper;
import Pakimon.Def.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService implements PokemonServiceInterface{

    private final PokemonDao pokemonDao;

    private final PokemonResponseMapper pokemonResponseMapper;
    private final PokemonRequestMapper pokemonRequestMapper;
    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonDao pokemonDao, PokemonResponseMapper pokemonResponseMapper, PokemonRequestMapper pokemonRequestMapper,
                          PokemonRepository pokemonRepository) {
        this.pokemonDao = pokemonDao;
        this.pokemonResponseMapper = pokemonResponseMapper;
        this.pokemonRequestMapper = pokemonRequestMapper;
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public PokemonResponseDto findPokemonById(Integer pokemonId) {

        return pokemonResponseMapper.pokemonResponseMap(pokemonDao.findPokemonByIdDao(pokemonId));
    }

    @Override
    public List<PokemonResponseDto> getPokemonList() {
        List<PokemonResponseDto> pokemonDtoList = pokemonDao.getPokemonListDao().stream().map(pokemonResponseMapper::pokemonResponseMap).collect(Collectors.toList());
        return pokemonDtoList;
    }

    @Override
    public void createPokemon(PokemonRequestDto pokemonRequestDto) {

        pokemonDao.createPokemonDao(pokemonRequestMapper.pokemonRequestMapper(pokemonRequestDto), pokemonRequestDto);
    }

    @Override
    public void editPokemon(Integer pokemon_id, PokemonRequestDto pokemonRequestDto) {

    }
}
