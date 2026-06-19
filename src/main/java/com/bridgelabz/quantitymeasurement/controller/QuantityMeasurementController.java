package com.bridgelabz.quantitymeasurement.controller;

import com.bridgelabz.quantitymeasurement.dto.QuantityDTO;
import com.bridgelabz.quantitymeasurement.service.IQuantityMeasurementService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/measurements")
public class QuantityMeasurementController {
    
    private final IQuantityMeasurementService service;

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    @PostMapping("/compare")
    public boolean compare(@RequestBody QuantityDTO[] dtos) {
        return service.compare(dtos[0], dtos[1]);
    }

    @PostMapping("/convert/{targetUnit}")
    public QuantityDTO convert(@RequestBody QuantityDTO q1, @PathVariable String targetUnit) {
        return service.convert(q1, targetUnit);
    }

    @PostMapping("/add/{targetUnit}")
    public QuantityDTO add(@RequestBody QuantityDTO[] dtos, @PathVariable String targetUnit) {
        return service.add(dtos[0], dtos[1], targetUnit);
    }

    @PostMapping("/subtract/{targetUnit}")
    public QuantityDTO subtract(@RequestBody QuantityDTO[] dtos, @PathVariable String targetUnit) {
        return service.subtract(dtos[0], dtos[1], targetUnit);
    }

    @PostMapping("/divide/{targetUnit}")
    public QuantityDTO divide(@RequestBody QuantityDTO[] dtos, @PathVariable String targetUnit) {
        return service.divide(dtos[0], dtos[1], targetUnit);
    }
}
