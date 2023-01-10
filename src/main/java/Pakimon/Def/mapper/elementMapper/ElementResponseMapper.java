package Pakimon.Def.mapper.elementMapper;

import Pakimon.Def.dto.elementDto.ElementResponseDto;
import Pakimon.Def.entities.ElementEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface ElementResponseMapper {
    ElementResponseMapper INSTANCE = Mappers.getMapper( ElementResponseMapper.class );


    @Mapping(source = "elementName", target = "elementNameDto")
    ElementResponseDto elementResponseMap(ElementEntity elementEntity);
}
