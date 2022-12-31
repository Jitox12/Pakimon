package pokemon.pakimon.services;

import org.springframework.stereotype.Service;
import pokemon.pakimon.Entities.AbilityEntity;
import pokemon.pakimon.dao.AbilityDao;

@Service
public class AbilityService implements AbilityServiceI{

    private final AbilityDao abilityDao;

    public AbilityService(AbilityDao abilityDao) {
        this.abilityDao = abilityDao;
    }

    @Override
    public AbilityEntity findAbility(Integer ability_id) throws Exception {
        return abilityDao.findAbility(ability_id);
    }
}
