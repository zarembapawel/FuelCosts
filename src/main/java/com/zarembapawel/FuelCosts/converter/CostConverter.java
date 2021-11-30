package com.zarembapawel.FuelCosts.converter;

import com.zarembapawel.FuelCosts.entity.CostEntity;
import com.zarembapawel.FuelCosts.model.Cost;
import org.springframework.stereotype.Component;

@Component
public class CostConverter {
    
    public Cost mapEntityToModel(CostEntity costEntity) {
        Cost cost = new Cost();
        cost.setId(costEntity.getId());
        cost.setCarId(costEntity.getCarId());
        cost.setPrice(costEntity.getPrice());
        cost.setDate(costEntity.getDate());
        return cost;
    }

    public CostEntity mapModelToEntity(Cost cost) {
        CostEntity costEntity = new CostEntity();
        costEntity.setId(cost.getId());
        costEntity.setCarId(cost.getCarId());
        costEntity.setPrice(cost.getPrice());
        costEntity.setDate(cost.getDate());
        return costEntity;
    }
}
