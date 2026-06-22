package com.bridgelabz.quantitymeasurement;

public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0),
    YARDS(36.0),
    CENTIMETERS(0.393701);

    private final double baseUnitConversionFactor;

    LengthUnit(double baseUnitConversionFactor) {
        this.baseUnitConversionFactor = baseUnitConversionFactor;
    }

    public double getConversionFactor() {
        return baseUnitConversionFactor;
    }

    public double convertToBaseUnit(double value) {
        return value * this.baseUnitConversionFactor;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / this.baseUnitConversionFactor;
    }
}
