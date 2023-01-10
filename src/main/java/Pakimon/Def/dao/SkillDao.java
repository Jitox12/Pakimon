package Pakimon.Def.dao;


import Pakimon.Def.entities.SkillEntity;

import java.util.List;

public interface SkillDao {
    public SkillEntity findSkillByIdDao(Integer skillId);
    public List<SkillEntity> getSkillListDao();
    public void createSkillDao(SkillEntity skillEntity);
    public void editSkillDao(SkillEntity skillEntity);
}
