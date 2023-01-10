package Pakimon.Def.services;

import Pakimon.Def.dto.abilityDto.AbilityRequestDto;
import Pakimon.Def.dto.abilityDto.AbilityResponseDto;
import Pakimon.Def.dto.elementDto.ElementRequestDto;
import Pakimon.Def.dto.elementDto.ElementResponseDto;

import java.util.List;

public interface ElementServiceInterface {

    public ElementResponseDto findElementById(Integer elementId);
    public List<ElementResponseDto> getElementList();
    public void createElement(ElementRequestDto elementRequestDto);
    public void editElement(Integer element_id, ElementRequestDto elementRequestDto);
}
