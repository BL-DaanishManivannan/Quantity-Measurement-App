package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.*;
import com.bridgelabz.quantitymeasurement.dto.QuantityDTO;
import com.bridgelabz.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.bridgelabz.quantitymeasurement.repository.IQuantityMeasurementRepository;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {
    
    private final IQuantityMeasurementRepository repository;

    public QuantityMeasurementServiceImpl(IQuantityMeasurementRepository repository) {
        this.repository = repository;
    }

    private IMeasurable getUnitFromString(String unitStr) {
        try {
            return LengthUnit.valueOf(unitStr.toUpperCase());
        } catch (IllegalArgumentException e1) {
            try {
                return WeightUnit.valueOf(unitStr.toUpperCase());
            } catch (IllegalArgumentException e2) {
                try {
                    return VolumeUnit.valueOf(unitStr.toUpperCase());
                } catch (IllegalArgumentException e3) {
                    try {
                        return TemperatureUnit.valueOf(unitStr.toUpperCase());
                    } catch (IllegalArgumentException e4) {
                        throw new IllegalArgumentException("Unknown unit: " + unitStr);
                    }
                }
            }
        }
    }

    private <U extends IMeasurable> Quantity<U> createQuantity(QuantityDTO dto) {
        U unit = (U) getUnitFromString(dto.getUnit());
        return new Quantity<>(dto.getValue(), unit);
    }

    @Override
    public boolean compare(QuantityDTO q1, QuantityDTO q2) {
        Quantity<?> quantity1 = createQuantity(q1);
        Quantity<?> quantity2 = createQuantity(q2);
        boolean result = quantity1.equals(quantity2);
        
        saveEntity(q1, q2, "COMPARE", result ? 1.0 : 0.0, "BOOLEAN");
        return result;
    }

    @Override
    public QuantityDTO convert(QuantityDTO q1, String targetUnitStr) {
        Quantity quantity1 = createQuantity(q1);
        IMeasurable targetUnit = getUnitFromString(targetUnitStr);
        
        Quantity result = quantity1.convertTo(targetUnit);
        
        saveEntity(q1, null, "CONVERT", result.getValue(), targetUnitStr);
        return new QuantityDTO(result.getValue(), targetUnitStr);
    }

    @Override
    public QuantityDTO add(QuantityDTO q1, QuantityDTO q2, String targetUnitStr) {
        Quantity quantity1 = createQuantity(q1);
        Quantity quantity2 = createQuantity(q2);
        IMeasurable targetUnit = getUnitFromString(targetUnitStr);
        
        Quantity result = quantity1.add(quantity2, targetUnit);
        
        saveEntity(q1, q2, "ADD", result.getValue(), targetUnitStr);
        return new QuantityDTO(result.getValue(), targetUnitStr);
    }

    @Override
    public QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2, String targetUnitStr) {
        Quantity quantity1 = createQuantity(q1);
        Quantity quantity2 = createQuantity(q2);
        IMeasurable targetUnit = getUnitFromString(targetUnitStr);
        
        Quantity result = quantity1.subtract(quantity2, targetUnit);
        
        saveEntity(q1, q2, "SUBTRACT", result.getValue(), targetUnitStr);
        return new QuantityDTO(result.getValue(), targetUnitStr);
    }

    @Override
    public QuantityDTO divide(QuantityDTO q1, QuantityDTO q2, String targetUnitStr) {
        Quantity quantity1 = createQuantity(q1);
        Quantity quantity2 = createQuantity(q2);
        IMeasurable targetUnit = getUnitFromString(targetUnitStr);
        
        Quantity result = quantity1.divide(quantity2, targetUnit);
        
        saveEntity(q1, q2, "DIVIDE", result.getValue(), targetUnitStr);
        return new QuantityDTO(result.getValue(), targetUnitStr);
    }

    private void saveEntity(QuantityDTO q1, QuantityDTO q2, String op, double resVal, String resUnit) {
        QuantityMeasurementEntity entity = new QuantityMeasurementEntity();
        entity.setValue1(q1.getValue());
        entity.setUnit1(q1.getUnit());
        if (q2 != null) {
            entity.setValue2(q2.getValue());
            entity.setUnit2(q2.getUnit());
        }
        entity.setOperation(op);
        entity.setResultValue(resVal);
        entity.setResultUnit(resUnit);
        repository.save(entity);
    }
}
