package Pakimon.Def.controllers;

import Pakimon.Def.dto.elementDto.ElementRequestDto;
import Pakimon.Def.dto.elementDto.ElementResponseDto;
import Pakimon.Def.services.ElementServiceInterface;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElementController {

    private final ElementServiceInterface elementServiceInterface;

    public ElementController(ElementServiceInterface elementServiceInterface) {
        this.elementServiceInterface = elementServiceInterface;
    }

    @GetMapping(value="api/find-element/{elementId}" )
    public ElementResponseDto findAbilityById(@PathVariable Integer elementId){

        return elementServiceInterface.findElementById(elementId);
    }
    @GetMapping(value = "api/find-elements")
    public List<ElementResponseDto> getElementList(){
        return elementServiceInterface.getElementList();
    }

    @Transactional
    @PostMapping(value= "api/create-element")
    public String createElement(@RequestBody ElementRequestDto elementRequestDto){
        elementServiceInterface.createElement(elementRequestDto);
        return "se ha creado : ".concat(elementRequestDto.getElementNameDto());
    }

    @Transactional
    @PutMapping(value="api/edit-element/{elementId}")
    public String editElement(@RequestBody ElementRequestDto elementRequestDto, @PathVariable Integer elementId){
        elementServiceInterface.editElement(elementId,elementRequestDto);
        return "Se ha editado : ".concat(elementRequestDto.getElementNameDto());
    }
}
