package pokemon.pakimon.dao;

import org.springframework.stereotype.Component;
import pokemon.pakimon.Entities.AbilityEntity;
import pokemon.pakimon.repositories.AbilityRepository;

import java.util.Objects;

@Component
public class AbilityDaoImpl implements AbilityDao{

    private final AbilityRepository abilityRepository;

    public AbilityDaoImpl(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    @Override
    public AbilityEntity findAbility(Integer ability_id) throws Exception{
        AbilityEntity ability = abilityRepository.findById(ability_id);

        if(Objects.isNull(ability)){
            throw new Exception();
        }
        return ability;
    }
}
