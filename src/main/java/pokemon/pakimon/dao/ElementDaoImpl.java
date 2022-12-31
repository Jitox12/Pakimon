package pokemon.pakimon.dao;

import org.springframework.stereotype.Component;
import pokemon.pakimon.Entities.ElementEntity;
import pokemon.pakimon.repositories.ElementRepository;

import java.util.Objects;

@Component
public class ElementDaoImpl implements ElementDao{

    private final ElementRepository elementRepository;

    public ElementDaoImpl(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public ElementEntity findElement(Integer element_id) throws Exception {
        ElementEntity element = elementRepository.findById(element_id);

        if(Objects.isNull(element)){
            throw new Exception();
        }
        return element;
    }
}
