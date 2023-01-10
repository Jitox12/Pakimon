package Pakimon.Def.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "ability")
public class AbilityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ability_id",nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer abilityId;

    @Column(name="ability_name",nullable = false, length = 50)
    private String abilityName;

    @Column(name="ability_description",nullable = false, length = 255)
    private String abilityDescription;
}
