package pokemon.pakimon.services;

import org.springframework.stereotype.Service;
import pokemon.pakimon.Entities.SkillEntity;
import pokemon.pakimon.dao.SkillDao;

@Service
public class SkillService implements SkillServiceI{

    private final SkillDao skillDao;

    public SkillService(SkillDao skillDao) {
        this.skillDao = skillDao;
    }

    @Override
    public SkillEntity findSkill(Integer skill_id) throws Exception {
        return skillDao.findSkill(skill_id);
    }
}
