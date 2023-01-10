package Pakimon.Def.mapper.skillMapper;

import Pakimon.Def.dto.skillDto.SkillRequestDto;
import Pakimon.Def.dto.skillDto.SkillResponseDto;
import Pakimon.Def.entities.SkillEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface SkillRequestMapper {
    SkillResponseMapper INSTANCE = Mappers.getMapper( SkillResponseMapper.class );



    @Mappings({
            @Mapping(source = "skillIdDto", target = "skillId"),
            @Mapping(source = "skillNameDto", target = "skillName"),
            @Mapping(source = "skillDefinitionDto", target = "skillDefinition"),
            @Mapping(source = "elementIdDto", target = "element.elementId"),
    })
    SkillEntity skillRequestMapper(SkillRequestDto skillRequestMapper);
}
