package com.musiienko.providerspring.repository;

import com.musiienko.providerspring.entity.plan.InternetPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternetPlanRepository extends CrudRepository<InternetPlan, Integer> {
}
