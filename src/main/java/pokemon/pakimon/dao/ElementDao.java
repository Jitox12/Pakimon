package pokemon.pakimon.dao;

import pokemon.pakimon.Entities.ElementEntity;

public interface ElementDao {

    public ElementEntity findElement(Integer element_id) throws Exception;
}
