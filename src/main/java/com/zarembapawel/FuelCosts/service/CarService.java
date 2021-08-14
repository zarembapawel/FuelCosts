package com.zarembapawel.FuelCosts.service;

import com.zarembapawel.FuelCosts.converter.CarConverter;
import com.zarembapawel.FuelCosts.entity.CarEntity;
import com.zarembapawel.FuelCosts.model.Car;
import com.zarembapawel.FuelCosts.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository repository;

    private final CarConverter converter;

    @Autowired
    public CarService(CarRepository repository, CarConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }


    public String getCars() {
        return null; 
    }

    public Car getCar(Integer id) {
        CarEntity entity = repository.getById(id);
        return converter.mapEntityToModel(entity);
    }
    
    public void addCar(Car car) {
        CarEntity entity = converter.mapModelToEntity(car);
        repository.save(entity);
    }

    public void updateCar(Car car) {
        addCar(car);
    }

    public void deleteCar(Integer id) {
        repository.deleteById(id);
    }
}
