package io.chrislowe.resettle.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data @Entity
public class User {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String discriminator;

    @Column(nullable = false)
    private Boolean banned;

    @Column(nullable = false)
    private Long money;

    @OneToMany(mappedBy = "user")
    private Set<UserItem> userItems;

    @OneToOne
    private Town town;
}
