package com.musiienko.providerspring.entity.plan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="internet_plans")
public class InternetPlan {
    @Id
    private int id;
    private int dataCap;
    private int downloadSpeed;
    private int uploadSpeed;
}
