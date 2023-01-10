package Pakimon.Def.mapper.abilityMapper;

import Pakimon.Def.dto.abilityDto.AbilityResponseDto;
import Pakimon.Def.entities.AbilityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface AbilityResponseMapper {
    AbilityResponseMapper INSTANCE = Mappers.getMapper( AbilityResponseMapper.class );

    @Mapping(source = "abilityName", target = "abilityNameDto")
    @Mapping(source = "abilityDescription", target = "abilityDescriptionDto")
    AbilityResponseDto abilityResponseMap(AbilityEntity ability);
}