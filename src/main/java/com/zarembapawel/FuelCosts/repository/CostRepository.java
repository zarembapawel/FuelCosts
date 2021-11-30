package com.zarembapawel.FuelCosts.repository;

import com.zarembapawel.FuelCosts.entity.CostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends CrudRepository<CostEntity, Integer> {

    public CostEntity getById(Integer id);
}
