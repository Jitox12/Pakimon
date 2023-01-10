package Pakimon.Def.mapper.skillMapper;

import Pakimon.Def.dto.skillDto.SkillResponseDto;
import Pakimon.Def.entities.ElementEntity;
import Pakimon.Def.entities.SkillEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface SkillResponseMapper {

    SkillResponseMapper INSTANCE = Mappers.getMapper( SkillResponseMapper.class );

    @Mappings({
            @Mapping(source = "skillName", target = "skillNameDto"),
            @Mapping(source = "skillDefinition", target = "skillDefinitionDto"),
            @Mapping(source = "element.elementName", target = "elementDto"),
    })
    SkillResponseDto skillResponseMapper (SkillEntity skillEntity);
}
