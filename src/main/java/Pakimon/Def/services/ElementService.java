package Pakimon.Def.services;

import Pakimon.Def.dao.ElementDao;
import Pakimon.Def.dto.elementDto.ElementRequestDto;
import Pakimon.Def.dto.elementDto.ElementResponseDto;
import Pakimon.Def.entities.ElementEntity;
import Pakimon.Def.mapper.elementMapper.ElementRequestMapper;
import Pakimon.Def.mapper.elementMapper.ElementResponseMapper;
import Pakimon.Def.repositories.ElementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ElementService implements ElementServiceInterface{

    private final ElementDao elementDao;
    private final ElementResponseMapper elementResponseMapper;
    private final ElementRequestMapper elementRequestMapper;

    public ElementService(ElementRepository elementRepository, ElementDao elementDao, ElementResponseMapper elementResponseMapper, ElementRequestMapper elementRequestMapper) {
        this.elementDao = elementDao;
        this.elementResponseMapper = elementResponseMapper;
        this.elementRequestMapper = elementRequestMapper;
    }

    @Override
    public ElementResponseDto findElementById(Integer elementId) {

        return elementResponseMapper.elementResponseMap(elementDao.findElementByIdDao(elementId));
    }

    @Override
    public List<ElementResponseDto> getElementList() {

        List<ElementResponseDto> elementResponseDto = elementDao.getElementListDao().stream().map(elementResponseMapper::elementResponseMap).collect(Collectors.toList());

        return elementResponseDto;
    }

    @Override
    public void createElement(ElementRequestDto elementRequestDto) {
        ElementEntity elementEntity = elementRequestMapper.elementRequestMap(elementRequestDto);
        elementDao.createElementDao(elementEntity);
    }

    @Override
    public void editElement(Integer elementId, ElementRequestDto elementRequestDto) {
        elementRequestDto.setElementIdDto(elementId);
        ElementEntity elementEntity = elementRequestMapper.elementRequestMap(elementRequestDto);
        elementDao.editElementDao(elementEntity);
    }
}
