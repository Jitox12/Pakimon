package pokemon.pakimon.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ability")
public class AbilityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ability_id", nullable = false)
    private Integer id;

    @Column(name = "ability_name", nullable = false, length = 50)
    private String abilityName;

    @Column(name = "ability_description", nullable = false)
    private String abilityDescription;

}