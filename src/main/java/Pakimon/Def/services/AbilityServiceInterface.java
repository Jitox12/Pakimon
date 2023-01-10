package Pakimon.Def.services;

import Pakimon.Def.dto.abilityDto.AbilityRequestDto;
import Pakimon.Def.dto.abilityDto.AbilityResponseDto;

import java.util.List;

public interface AbilityServiceInterface {

    public AbilityResponseDto findAbilityById(Integer abilityId);
    public List<AbilityResponseDto> getAbilityList();
    public void createAbility(AbilityRequestDto abilityRequestDto);
    public void editAbility(Integer abilityId, AbilityRequestDto abilityRequestDto);
}
