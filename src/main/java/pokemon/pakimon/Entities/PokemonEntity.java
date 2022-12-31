package pokemon.pakimon.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pokemon")
public class PokemonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "poke_num", nullable = false)
    private Integer id;

    @Column(name = "pokemon_name", nullable = false, length = 50)
    private String pokemonName;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ability_id", nullable = false)
    private AbilityEntity ability;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pokemonelement",
            joinColumns = {@JoinColumn(name = "poke_num", referencedColumnName = "poke_num")},
            inverseJoinColumns = {@JoinColumn(name = "element_id", referencedColumnName = "element_id")})
    private List<ElementEntity> elements;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pokemonskill",
            joinColumns = {@JoinColumn(name = "poke_num", referencedColumnName = "poke_num")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id", referencedColumnName = "skill_id")})
    private List<SkillEntity> skillEntities;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pokemonweakness",
            joinColumns = {@JoinColumn(name = "poke_num", referencedColumnName = "poke_num")},
            inverseJoinColumns = {@JoinColumn(name = "weakness_id", referencedColumnName = "element_id")})
    private List<ElementEntity> weaknesses;
}