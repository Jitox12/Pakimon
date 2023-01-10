package Pakimon.Def.controllers;

import Pakimon.Def.dto.skillDto.SkillRequestDto;
import Pakimon.Def.dto.skillDto.SkillResponseDto;
import Pakimon.Def.services.SkillServiceInterface;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillController {

    private final SkillServiceInterface skillServiceInterface;

    public SkillController(SkillServiceInterface skillServiceInterface) {
        this.skillServiceInterface = skillServiceInterface;
    }


    @GetMapping(value="api/find-skill/{skillId}" )
    public SkillResponseDto findSkillById(@PathVariable Integer skillId){
        return skillServiceInterface.findSkillById(skillId);
    }

    @GetMapping(value = "api/find-skills")
    public List<SkillResponseDto> getSkillList(){
        return skillServiceInterface.getSkillList();
    }

    @Transactional
    @PostMapping(value= "api/create-skill")
    public String createSkill(@RequestBody SkillRequestDto skillRequestDto){
        skillServiceInterface.createSkill(skillRequestDto);
        return "se ha creado : ".concat(skillRequestDto.getSkillNameDto());
    }

    @Transactional
    @PutMapping(value="api/edit-skill/{skillId}")
    public String editSkill(@RequestBody SkillRequestDto skillRequestDto, @PathVariable Integer skillId){
        skillServiceInterface.editSkill(skillId, skillRequestDto);
        return "Se ha editado : ".concat(skillRequestDto.getSkillNameDto());
    }
}