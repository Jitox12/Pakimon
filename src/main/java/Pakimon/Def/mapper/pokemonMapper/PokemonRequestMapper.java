package Pakimon.Def.mapper.pokemonMapper;

import Pakimon.Def.dto.PokemonDto.PokemonRequestDto;
import Pakimon.Def.dto.PokemonDto.PokemonResponseDto;
import Pakimon.Def.entities.AbilityEntity;
import Pakimon.Def.entities.ElementEntity;
import Pakimon.Def.entities.PokemonEntity;
import Pakimon.Def.entities.SkillEntity;
import Pakimon.Def.mapper.elementMapper.ElementResponseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface PokemonRequestMapper {
    ElementResponseMapper INSTANCE = Mappers.getMapper( ElementResponseMapper.class );

    ElementEntity ElementIdToElement(Integer value);
    List<ElementEntity> ElementIdToElement(List<Integer> value);

    @Mappings({
            @Mapping(source = "pokemonNumberDto", target = "pokemonNumber"),
            @Mapping(source = "pokemonNameDto", target = "pokemonName"),
    })

    PokemonEntity pokemonRequestMapper (PokemonRequestDto pokemonRequestMap);
}