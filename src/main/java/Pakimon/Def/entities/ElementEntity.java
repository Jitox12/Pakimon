package Pakimon.Def.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "element")
public class ElementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "element_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer elementId;

    @Column(name="element_name")
    private String elementName;
}
