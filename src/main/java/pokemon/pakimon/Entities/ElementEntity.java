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
@Table(name = "element")
public class ElementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "element_id", nullable = false)
    private Integer id;

    @Column(name = "element_name", nullable = false, length = 50)
    private String elementName;

}