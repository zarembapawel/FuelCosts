package com.zarembapawel.FuelCosts.converter;

import com.zarembapawel.FuelCosts.entity.CarEntity;
import com.zarembapawel.FuelCosts.model.Car;

public class CarConverter {
    
    public Car mapEntityToModel(CarEntity carEntity) {
        Car car = new Car(); 
        car.setId(carEntity.getId());
        car.setBrand(carEntity.getBrand());
        car.setModel(carEntity.getModel());
        car.setEngine(carEntity.getEngine());
        car.setFuelType(carEntity.getFuelType());
        car.setRegistrationNumber(carEntity.getRegistrationNumber());
        return car;
    }

    public CarEntity mapModelToEntity(Car car) {
        CarEntity carEntity = new CarEntity(); 
        carEntity.setId(car.getId());
        carEntity.setBrand(car.getBrand());
        carEntity.setModel(car.getModel());
        carEntity.setEngine(car.getEngine());
        carEntity.setFuelType(car.getFuelType());
        carEntity.setRegistrationNumber(car.getRegistrationNumber());
        return carEntity;
    }
}
