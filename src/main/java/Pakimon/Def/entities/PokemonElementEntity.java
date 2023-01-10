package Pakimon.Def.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pokemonelement")
public class PokemonElementEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "pokemon_element_id", nullable = false)
    private Integer pokemonElementId;

    @JoinColumn(name = "pokemon_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PokemonEntity pokemonId;

    @JoinColumn(name = "element_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ElementEntity elementId;
}
