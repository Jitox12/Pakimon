package Pakimon.Def.mapper.pokemonMapper;

import Pakimon.Def.dto.PokemonDto.PokemonResponseDto;
import Pakimon.Def.dto.elementDto.ElementResponseDto;
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
public interface PokemonResponseMapper {
    ElementResponseMapper INSTANCE = Mappers.getMapper( ElementResponseMapper.class );

    List<String> mapElementName(List<ElementEntity> elementEntityList);
    default String PokemonEntityElementsToElementName(ElementEntity elementEntity){
        return elementEntity.getElementName();
    }
    List<String> mapSkillName(List<SkillEntity> skillEntityList);
    default String PokemonEntitySkillsToSkillName(SkillEntity skillEntity){
        return skillEntity.getSkillName();
    }

    List<String> mapAbilityName(List<AbilityEntity> abilityEntityList);
    default String PokemonEntityAbilityToAbilityName(AbilityEntity abilityEntity){
        return abilityEntity.getAbilityName();
    }

    @Mappings({
            @Mapping(source = "pokemonNumber", target = "pokemonNumberDto"),
            @Mapping(source = "pokemonName", target = "pokemonNameDto"),
            @Mapping(source = "elements", target = "elementsNameDto"),
            @Mapping(source = "skills", target = "skillsNameDto"),
            @Mapping(source = "abilities", target = "abilitiesNameDto"),
    })
    PokemonResponseDto pokemonResponseMap(PokemonEntity pokemonEntity);
}
