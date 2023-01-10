package Pakimon.Def.dao;

import Pakimon.Def.entities.SkillEntity;
import Pakimon.Def.repositories.SkillRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SkillDaoImpl implements SkillDao{

    private final SkillRepository skillRepository;

    public SkillDaoImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public SkillEntity findSkillByIdDao(Integer skillId) {
        return skillRepository.findBySkillId(skillId);
    }

    @Override
    public List<SkillEntity> getSkillListDao() {
        return skillRepository.findAll();
    }

    @Override
    public void createSkillDao(SkillEntity skillEntity) {
        skillRepository.save(skillEntity);
    }

    @Override
    public void editSkillDao(SkillEntity skillEntity) {
        skillRepository.save(skillEntity);
    }
}
