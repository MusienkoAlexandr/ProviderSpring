package com.musiienko.providerspring.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    @Id
    private int id;
    private LocalDateTime initialDateTime;
    @ManyToOne
    private User user;
    @ManyToOne
    private Rate rate;
}
