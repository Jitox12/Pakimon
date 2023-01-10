package Pakimon.Def.dao;

import Pakimon.Def.entities.AbilityEntity;
import Pakimon.Def.repositories.AbilityRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AbilityDaoImpl implements AbilityDao{
    private final AbilityRepository abilityRepository;

    public AbilityDaoImpl(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    @Override
    public AbilityEntity findAbilityByIdDao(Integer abilityId) {
        return abilityRepository.findByAbilityId(abilityId);
    }

    @Override
    public List<AbilityEntity> getAbilityListDao() {
        List<AbilityEntity> abilityList = abilityRepository.findAll();
        return abilityList;
    }

    @Override
    public void createAbilityDao(AbilityEntity abilityEntity) {
        abilityRepository.save(abilityEntity);
    }

    @Override
    public void editAbilityDao(AbilityEntity abilityEntity) {
        abilityRepository.save(abilityEntity);
    }
}
