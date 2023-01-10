package Pakimon.Def.dto.PokemonDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PokemonResponseDto extends PokemonDto{

    private List<String> skillsNameDto;
    private List<String> abilitiesNameDto;
    private List<String> elementsNameDto;

}
