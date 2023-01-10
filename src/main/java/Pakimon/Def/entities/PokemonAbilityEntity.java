package Pakimon.Def.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pokemonability")
public class PokemonAbilityEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "pokemon_ability_id", nullable = false)
    private Integer pokemonAbilityId;

    @JoinColumn(name = "pokemon_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PokemonEntity pokemonId;

    @JoinColumn(name = "ability_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private AbilityEntity abilityId;
}
