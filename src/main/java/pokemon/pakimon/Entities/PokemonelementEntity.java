package pokemon.pakimon.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pokemonelement")
public class PokemonelementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "pokemonElement_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "poke_num", nullable = false)
    private PokemonEntity pokeNum;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "element_id", nullable = false)
    private ElementEntity element;

}