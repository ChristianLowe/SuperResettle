package io.chrislowe.resettle.jpa;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class TownBuilding {

    @Id @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "town_id")
    Town town;

    @Column(nullable = false)
    String buildingId;

    @Column(nullable = false)
    Integer level;
}
