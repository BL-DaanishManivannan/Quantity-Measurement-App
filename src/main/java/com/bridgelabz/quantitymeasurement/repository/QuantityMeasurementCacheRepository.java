package com.bridgelabz.quantitymeasurement.repository;

import com.bridgelabz.quantitymeasurement.entity.QuantityMeasurementEntity;
import java.util.ArrayList;
import java.util.List;

public class QuantityMeasurementCacheRepository implements IQuantityMeasurementRepository {
    private final List<QuantityMeasurementEntity> cache = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void save(QuantityMeasurementEntity entity) {
        entity.setId(currentId++);
        cache.add(entity);
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {
        return new ArrayList<>(cache);
    }
}
