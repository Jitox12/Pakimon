package Pakimon.Def.dao;

import Pakimon.Def.entities.AbilityEntity;

import java.util.List;

public interface AbilityDao {

    public AbilityEntity findAbilityByIdDao(Integer abilityId);
    public List<AbilityEntity> getAbilityListDao();
    public void createAbilityDao(AbilityEntity abilityEntity);
    public void editAbilityDao(AbilityEntity abilityEntity);
}
