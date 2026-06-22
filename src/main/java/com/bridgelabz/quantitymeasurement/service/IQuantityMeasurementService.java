package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.dto.QuantityDTO;

public interface IQuantityMeasurementService {
    boolean compare(QuantityDTO q1, QuantityDTO q2);
    QuantityDTO convert(QuantityDTO q1, String targetUnit);
    QuantityDTO add(QuantityDTO q1, QuantityDTO q2, String targetUnit);
    QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2, String targetUnit);
    QuantityDTO divide(QuantityDTO q1, QuantityDTO q2, String targetUnit);
}
