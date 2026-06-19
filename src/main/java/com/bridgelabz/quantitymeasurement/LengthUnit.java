package com.bridgelabz.quantitymeasurement;

public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0);

    private final double baseUnitConversionFactor;

    LengthUnit(double baseUnitConversionFactor) {
        this.baseUnitConversionFactor = baseUnitConversionFactor;
    }

    public double getConversionFactor() {
        return baseUnitConversionFactor;
    }
}
