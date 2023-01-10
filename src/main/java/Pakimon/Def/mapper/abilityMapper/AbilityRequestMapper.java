package Pakimon.Def.mapper.abilityMapper;

import Pakimon.Def.dto.abilityDto.AbilityRequestDto;
import Pakimon.Def.dto.abilityDto.AbilityResponseDto;
import Pakimon.Def.entities.AbilityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface AbilityRequestMapper {
    AbilityResponseMapper INSTANCE = Mappers.getMapper( AbilityResponseMapper.class );

    @Mapping(source = "abilityIdDto", target = "abilityId")
    @Mapping(source = "abilityNameDto", target = "abilityName")
    @Mapping(source = "abilityDescriptionDto", target = "abilityDescription")
    AbilityEntity abilityRequestMap(AbilityRequestDto abilityRequestDto);
}
