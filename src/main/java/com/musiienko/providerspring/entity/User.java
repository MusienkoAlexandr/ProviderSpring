package com.musiienko.providerspring.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private BigDecimal money;
    @OneToMany(mappedBy = "user")
    List<Subscription> subscriptions;
    private Role role;
    private Status status;

    enum Role {
        USER, ADMIN
    }

    enum Status {
        ACTIVE, DEBTOR, BLOCKED
    }

}
