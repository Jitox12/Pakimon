package Pakimon.Def.dao;

import Pakimon.Def.entities.ElementEntity;
import Pakimon.Def.repositories.ElementRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ElementDaoImpl implements ElementDao{
    private final ElementRepository elementRepository;

    public ElementDaoImpl(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public ElementEntity findElementByIdDao(Integer elementId) {;
        return elementRepository.findByElementId(elementId);
    }

    @Override
    public List<ElementEntity>    getElementListDao() {
        return elementRepository.findAll();
    }

    @Override
    public void createElementDao(ElementEntity elementEntity) {
        elementRepository.save(elementEntity);
    }

    @Override
    public void editElementDao(ElementEntity elementEntity) {
        elementRepository.save(elementEntity);
    }
}
