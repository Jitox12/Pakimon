package Pakimon.Def.dto.skillDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillRequestDto {
    private Integer skillIdDto;
    private String  skillNameDto;
    private String  skillDefinitionDto;
    private Integer elementIdDto;
}
