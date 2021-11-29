package com.musiienko.providerspring.entity.plan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone_plans")
public class PhonePlan {
    @Id
    private int id;
    private int minutesInNetwork;
    private int minutesForMobile;
}
