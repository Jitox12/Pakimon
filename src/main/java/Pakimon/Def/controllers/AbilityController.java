package Pakimon.Def.controllers;

import Pakimon.Def.dto.abilityDto.AbilityRequestDto;
import Pakimon.Def.dto.abilityDto.AbilityResponseDto;
import Pakimon.Def.entities.AbilityEntity;
import Pakimon.Def.services.AbilityServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbilityController {
    private final AbilityServiceInterface abilityService;

    public AbilityController(AbilityServiceInterface abilityService) {
        this.abilityService = abilityService;
    }

    @GetMapping(value="api/find-ability/{abilityId}" )
    public AbilityResponseDto findAbilityById(@PathVariable Integer abilityId){
        return abilityService.findAbilityById(abilityId);
    }
    @GetMapping(value="api/find-abilities" )
    public List<AbilityResponseDto> GetAbilityList(){
        return abilityService.getAbilityList();
    }

    @PostMapping(value="api/create-ability")
    public String createAbility(@RequestBody AbilityRequestDto abilityRequestDto){
        abilityService.createAbility(abilityRequestDto);
        return "Se ha Creado la Abilidad :".concat(abilityRequestDto.getAbilityNameDto());
    }
    @PutMapping(value = "api/edit-ability/{abilityId}")
    public String editAbility(@PathVariable Integer abilityId, @RequestBody AbilityRequestDto abilityRequestDto){

        abilityService.editAbility(abilityId,abilityRequestDto);
        return "Se ha editado ".concat(abilityRequestDto.getAbilityNameDto());
    }
}