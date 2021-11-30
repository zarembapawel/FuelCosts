package com.zarembapawel.FuelCosts.controller;

import com.zarembapawel.FuelCosts.model.Cost;
import com.zarembapawel.FuelCosts.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Cost")
public class CostController {

    private final CostService service; 

    @Autowired
    public CostController(CostService service) {
        this.service = service;
    }


    @GetMapping
    public String getCosts() {
        return service.getCosts(); 
    }

    @GetMapping(value = "/{id}")
    public Cost getCost(@PathVariable Integer id) {
        return service.getCost(id);
    }
    
    @PostMapping
    public void addCost(@RequestParam Cost Cost) {
        service.addCost(Cost);
    }

    @PatchMapping
    public void updateCost(@RequestParam Cost Cost) {
        service.updateCost(Cost);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCost(@PathVariable Integer id) {
        service.deleteCost(id);
    }
}
