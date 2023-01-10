package Pakimon.Def.services;

import Pakimon.Def.dto.elementDto.ElementRequestDto;
import Pakimon.Def.dto.skillDto.SkillRequestDto;
import Pakimon.Def.dto.skillDto.SkillResponseDto;

import java.util.List;

public interface SkillServiceInterface {

    public SkillResponseDto findSkillById(Integer skillId);
    public List<SkillResponseDto> getSkillList();
    public void createSkill(SkillRequestDto skillRequestDto);
    public void editSkill(Integer skill_id, SkillRequestDto skillRequestDto);
}
