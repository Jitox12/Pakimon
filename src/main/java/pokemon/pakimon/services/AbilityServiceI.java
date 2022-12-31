package pokemon.pakimon.services;

import pokemon.pakimon.Entities.AbilityEntity;

public interface AbilityServiceI {

    public AbilityEntity findAbility(Integer ability_id) throws Exception;
}
