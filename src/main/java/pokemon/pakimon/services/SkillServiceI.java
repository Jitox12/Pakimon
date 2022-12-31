package pokemon.pakimon.services;

import pokemon.pakimon.Entities.SkillEntity;

public interface SkillServiceI {

    public SkillEntity findSkill(Integer skill_id) throws Exception;
}
