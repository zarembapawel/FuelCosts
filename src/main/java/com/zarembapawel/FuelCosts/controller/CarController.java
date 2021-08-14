package com.zarembapawel.FuelCosts.controller;

import com.zarembapawel.FuelCosts.model.Car;
import com.zarembapawel.FuelCosts.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService service; 

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }


    @GetMapping
    public String getCars() {
        return service.getCars(); 
    }

    @GetMapping(value = "/{id}")
    public String getCar(@PathVariable Integer id) {
        return service.getCar(id);
    }
    
    @PostMapping
    public void addCar(@RequestParam Car car) {
        service.addCar(car);
    }

    @PatchMapping
    public void updateCar(@RequestParam Car car) {
        service.updateCar(car);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCar(@PathVariable Integer id) {
        service.deleteCar(id);
    }
}
