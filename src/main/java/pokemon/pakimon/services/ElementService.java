package pokemon.pakimon.services;

import org.springframework.stereotype.Service;
import pokemon.pakimon.Entities.ElementEntity;
import pokemon.pakimon.dao.ElementDao;

@Service
public class ElementService implements ElementServiceI{

    private final ElementDao elementDao;

    public ElementService(ElementDao elementDao) {
        this.elementDao = elementDao;
    }

    @Override
    public ElementEntity findElement(Integer element_id) throws Exception {
        return elementDao.findElement(element_id);
    }
}
