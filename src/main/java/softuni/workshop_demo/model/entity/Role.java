package softuni.workshop_demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "roles")
@Entity
public class Role extends BaseEntity {
    private String name;
    @Column(name="name",unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
    }
}
