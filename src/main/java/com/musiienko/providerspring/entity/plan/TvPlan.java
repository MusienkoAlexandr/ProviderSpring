package com.musiienko.providerspring.entity.plan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tv_plans")
public class TvPlan {
    @Id
    private int id;
    private int numberOfChannels;

}
