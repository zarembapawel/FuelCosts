package com.zarembapawel.FuelCosts.controller;

import com.zarembapawel.FuelCosts.model.Car;

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
    
    @GetMapping
    public String getCars() {
        return null; 
    }

    @GetMapping(value = "/{id}")
    public String getCar(@PathVariable Integer id) {
        return null;
    }
    
    @PostMapping
    public void addCar(@RequestParam Car car) {

    }

    @PatchMapping
    public void updateCar(@RequestParam Car car) {

    }

    @DeleteMapping(value = "/{id}")
    public void deleteCar(@PathVariable Integer id) {

    }
}
