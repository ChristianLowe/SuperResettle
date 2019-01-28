package io.chrislowe.resettle.jpa;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class UserItem {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String itemId;

    @Column(nullable = false)
    private Integer level;
}
