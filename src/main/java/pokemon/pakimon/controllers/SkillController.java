package pokemon.pakimon.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pokemon.pakimon.Entities.SkillEntity;
import pokemon.pakimon.services.SkillServiceI;

@RestController
public class SkillController {
    private final SkillServiceI skillServiceI;

    public SkillController(SkillServiceI skillServiceI) {
        this.skillServiceI = skillServiceI;
    }

    @RequestMapping(value = "api/skill/{skill_id}", method = RequestMethod.GET)
    public SkillEntity findSkill(@PathVariable Integer skill_id) throws Exception{
        return skillServiceI.findSkill(skill_id);
    }
}
