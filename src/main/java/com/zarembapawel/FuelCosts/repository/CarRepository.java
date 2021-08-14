package com.zarembapawel.FuelCosts.repository;

import com.zarembapawel.FuelCosts.entity.CarEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, Integer> {

    public CarEntity getById(Integer id);
}
