package pokemon.pakimon.services;

import pokemon.pakimon.Entities.ElementEntity;


public interface ElementServiceI {

    public ElementEntity findElement(Integer element_id) throws Exception;
}
