package pokemon.pakimon.dao;

import org.springframework.stereotype.Component;
import pokemon.pakimon.Entities.SkillEntity;
import pokemon.pakimon.repositories.SkillRepository;
import java.util.Objects;

@Component
public class SkillDaoImpl implements SkillDao{

    private final SkillRepository skillRepository;

    public SkillDaoImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public SkillEntity findSkill(Integer skill_id) throws Exception {
        SkillEntity skill = skillRepository.findById(skill_id);

        if(Objects.isNull(skill)){
            throw new Exception();
        }
        return skill;
    }
}
