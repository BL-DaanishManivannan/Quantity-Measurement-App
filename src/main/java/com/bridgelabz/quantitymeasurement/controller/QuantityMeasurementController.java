package com.bridgelabz.quantitymeasurement.controller;

import com.bridgelabz.quantitymeasurement.dto.QuantityDTO;
import com.bridgelabz.quantitymeasurement.service.IQuantityMeasurementService;

public class QuantityMeasurementController {
    
    private final IQuantityMeasurementService service;

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    public boolean compare(QuantityDTO q1, QuantityDTO q2) {
        return service.compare(q1, q2);
    }

    public QuantityDTO convert(QuantityDTO q1, String targetUnit) {
        return service.convert(q1, targetUnit);
    }

    public QuantityDTO add(QuantityDTO q1, QuantityDTO q2, String targetUnit) {
        return service.add(q1, q2, targetUnit);
    }

    public QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2, String targetUnit) {
        return service.subtract(q1, q2, targetUnit);
    }

    public QuantityDTO divide(QuantityDTO q1, QuantityDTO q2, String targetUnit) {
        return service.divide(q1, q2, targetUnit);
    }
}
