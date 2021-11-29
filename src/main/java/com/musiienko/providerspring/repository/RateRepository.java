package com.musiienko.providerspring.repository;

import com.musiienko.providerspring.entity.Rate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends CrudRepository<Rate, Integer> {
}
