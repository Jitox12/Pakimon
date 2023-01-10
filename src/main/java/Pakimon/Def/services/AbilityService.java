package Pakimon.Def.services;

import Pakimon.Def.dao.AbilityDao;
import Pakimon.Def.dto.abilityDto.AbilityDto;
import Pakimon.Def.dto.abilityDto.AbilityRequestDto;
import Pakimon.Def.dto.abilityDto.AbilityResponseDto;
import Pakimon.Def.entities.AbilityEntity;
import Pakimon.Def.mapper.abilityMapper.AbilityRequestMapper;
import Pakimon.Def.mapper.abilityMapper.AbilityResponseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbilityService implements AbilityServiceInterface{
    private final AbilityDao abilityDao;
    private final AbilityResponseMapper abilityResponseMapper;
    private final AbilityRequestMapper abilityRequestMapper;

    public AbilityService(AbilityDao abilityDao, AbilityResponseMapper abilityResponseMapper, AbilityRequestMapper abilityRequestMapper) {
        this.abilityDao = abilityDao;
        this.abilityResponseMapper = abilityResponseMapper;
        this.abilityRequestMapper = abilityRequestMapper;
    }

    @Override
    public AbilityResponseDto findAbilityById(Integer abilityId) {


        return abilityResponseMapper.abilityResponseMap(abilityDao.findAbilityByIdDao(abilityId));
    }

    @Override
    public List<AbilityResponseDto> getAbilityList() {
        List<AbilityResponseDto> AbilityResponseDto = abilityDao.getAbilityListDao().stream().map(abilityResponseMapper::abilityResponseMap).collect(Collectors.toList());
        return AbilityResponseDto;
    }

    @Override
    public void createAbility(AbilityRequestDto abilityRequestDto) {
        AbilityEntity ability = abilityRequestMapper.abilityRequestMap(abilityRequestDto);
        abilityDao.createAbilityDao(ability);
    }

    @Override
    public void editAbility(Integer abilityId, AbilityRequestDto abilityRequestDto) {
        abilityRequestDto.setAbilityIdDto(abilityId);
        AbilityEntity ability = abilityRequestMapper.abilityRequestMap(abilityRequestDto);

        abilityDao.editAbilityDao(ability);
    }
}
