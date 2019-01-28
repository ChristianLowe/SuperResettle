package io.chrislowe.resettle.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data @Entity
public class Town {

    @Id @GeneratedValue
    private Long id;

    @OneToOne(optional = false)
    private User user;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer fenceStrength;

    @OneToMany(mappedBy = "town")
    private Set<TownBuilding> buildings;
}
