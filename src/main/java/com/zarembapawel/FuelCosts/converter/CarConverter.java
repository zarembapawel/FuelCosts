package com.zarembapawel.FuelCosts.converter;

import com.zarembapawel.FuelCosts.entity.CarEntity;
import com.zarembapawel.FuelCosts.model.Car;

public class CarConverter {
    
    public Car mapEntityToModel(CarEntity carEntity) {
        Car car = new Car(); 
        return car;
    }


    public CarEntity mapModelToEntity(Car car) {
        CarEntity carEntity = new CarEntity(); 
        return carEntity;
    }
}
