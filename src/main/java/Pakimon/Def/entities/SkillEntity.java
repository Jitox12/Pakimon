package Pakimon.Def.entities;

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
@Table(name = "skill")
public class SkillEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "skill_id", nullable = false)
    private Integer skillId;

    @Column(name = "skill_name", nullable = false)
    private String skillName;

    @Column(name = "skill_definition", nullable = false)
    private String skillDefinition;

    @ManyToOne
    @JoinColumn(name = "element_id", nullable = false)
    private ElementEntity element;
}