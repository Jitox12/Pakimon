package Pakimon.Def.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pokemon")
public class PokemonEntity implements Serializable {

    @Id
    @Column(name = "pokemon_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer pokemonId;

    @Column(name = "pokemon_number", nullable = false)
    private Integer pokemonNumber;

    @Column(name = "pokemon_name", nullable = false)
    private String pokemonName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pokemonelement",
            joinColumns = {@JoinColumn(name = "pokemon_id", referencedColumnName = "pokemon_id")},
            inverseJoinColumns = {@JoinColumn(name = "element_id", referencedColumnName = "element_id")})
    private List<ElementEntity> elements;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pokemonskill",
            joinColumns = {@JoinColumn(name = "pokemon_id", referencedColumnName = "pokemon_id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id", referencedColumnName = "skill_id")})
    private List<SkillEntity> skills;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "pokemonability",
            joinColumns = {@JoinColumn(name = "pokemon_id", referencedColumnName = "pokemon_id")},
            inverseJoinColumns = {@JoinColumn(name = "ability_id", referencedColumnName = "ability_id")})
    private List<AbilityEntity> abilities;
}