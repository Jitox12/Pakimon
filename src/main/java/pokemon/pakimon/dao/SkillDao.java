package pokemon.pakimon.dao;

import pokemon.pakimon.Entities.SkillEntity;

public interface SkillDao {

    public SkillEntity findSkill(Integer skill_id) throws Exception;
}
