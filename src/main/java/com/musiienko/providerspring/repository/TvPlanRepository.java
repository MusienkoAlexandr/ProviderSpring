package com.musiienko.providerspring.repository;

import com.musiienko.providerspring.entity.plan.TvPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvPlanRepository extends CrudRepository<TvPlan, Integer> {
}
