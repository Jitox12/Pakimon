package pokemon.pakimon.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pokemon.pakimon.Entities.AbilityEntity;
import pokemon.pakimon.services.AbilityServiceI;

@RestController
public class AbilityController {
    private final AbilityServiceI abilityServiceI;

    public AbilityController(AbilityServiceI abilityServiceI) {
        this.abilityServiceI = abilityServiceI;
    }

    @RequestMapping(value="api/ability/{ability_id}", method = RequestMethod.GET)
    public AbilityEntity getElementsByPokemon(@PathVariable Integer ability_id) throws Exception {

        return abilityServiceI.findAbility(ability_id);
    }

    }
