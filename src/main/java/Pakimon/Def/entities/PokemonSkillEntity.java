package Pakimon.Def.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@Table(name = "pokemonskill")
@NoArgsConstructor
@AllArgsConstructor
public class PokemonSkillEntity {

    @Id
    @Column(name = "pokemon_skill_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer pokemonSkillId;

    @JoinColumn(name = "pokemon_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PokemonEntity pokemonId;

    @JoinColumn(name = "skill_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SkillEntity skillId;


}
