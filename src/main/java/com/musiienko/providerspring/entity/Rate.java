package com.musiienko.providerspring.entity;

import com.musiienko.providerspring.entity.plan.InternetPlan;
import com.musiienko.providerspring.entity.plan.PhonePlan;
import com.musiienko.providerspring.entity.plan.TvPlan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "rates")
public class Rate {
    @Id
    private int id;
    private String title;
    private BigDecimal price;
    @ManyToOne
    private PhonePlan phonePlan;
    @ManyToOne
    private InternetPlan internetPlan;
    @ManyToOne
    private TvPlan tvPlan;
}
