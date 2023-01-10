package Pakimon.Def.dto.skillDto;

import Pakimon.Def.entities.ElementEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.text.Element;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillResponseDto {
    private String  skillNameDto;
    private String  skillDefinitionDto;
    private String elementDto;
}
