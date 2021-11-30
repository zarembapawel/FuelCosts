package com.zarembapawel.FuelCosts.service;

import com.zarembapawel.FuelCosts.converter.CostConverter;
import com.zarembapawel.FuelCosts.entity.CostEntity;
import com.zarembapawel.FuelCosts.model.Cost;
import com.zarembapawel.FuelCosts.repository.CostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostService {

    private final CostRepository repository;

    private final CostConverter converter;

    @Autowired
    public CostService(CostRepository repository, CostConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }


    public String getCosts() {
        return null; 
    }

    public Cost getCost(Integer id) {
        CostEntity entity = repository.getById(id);
        return converter.mapEntityToModel(entity);
    }
    
    public void addCost(Cost Cost) {
        CostEntity entity = converter.mapModelToEntity(Cost);
        repository.save(entity);
    }

    public void updateCost(Cost Cost) {
        addCost(Cost);
    }

    public void deleteCost(Integer id) {
        repository.deleteById(id);
    }
}
