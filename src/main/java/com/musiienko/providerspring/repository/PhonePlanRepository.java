package com.musiienko.providerspring.repository;

import com.musiienko.providerspring.entity.plan.PhonePlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhonePlanRepository extends CrudRepository<PhonePlan, Integer> {
}
