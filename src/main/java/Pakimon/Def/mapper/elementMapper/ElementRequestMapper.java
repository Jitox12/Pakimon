package Pakimon.Def.mapper.elementMapper;

import Pakimon.Def.dto.elementDto.ElementRequestDto;
import Pakimon.Def.entities.ElementEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface ElementRequestMapper {
    ElementRequestMapper INSTANCE = Mappers.getMapper( ElementRequestMapper.class );

    @Mapping(source = "elementIdDto", target = "elementId")
    @Mapping(source = "elementNameDto", target = "elementName")
    ElementEntity elementRequestMap (ElementRequestDto elementRequestMap);
}
