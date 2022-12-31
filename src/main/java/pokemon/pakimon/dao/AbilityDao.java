package pokemon.pakimon.dao;

import pokemon.pakimon.Entities.AbilityEntity;

public interface AbilityDao {

    public AbilityEntity findAbility(Integer ability_id) throws Exception;
}
