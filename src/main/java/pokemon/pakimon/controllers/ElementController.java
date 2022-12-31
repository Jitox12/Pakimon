package pokemon.pakimon.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pokemon.pakimon.Entities.ElementEntity;
import pokemon.pakimon.services.ElementServiceI;

@RestController
public class ElementController {

    private final ElementServiceI elementServiceI;

    public ElementController(ElementServiceI elementServiceI) {
        this.elementServiceI = elementServiceI;
    }

    @RequestMapping(value = "api/element/{element_id}", method = RequestMethod.GET)
    public ElementEntity findElement(@PathVariable Integer element_id) throws Exception{

        return elementServiceI.findElement(element_id);
    }
}
