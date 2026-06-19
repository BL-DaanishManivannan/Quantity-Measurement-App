package com.bridgelabz.quantitymeasurement;

public enum WeightUnit implements IMeasurable {
    KILOGRAM(1.0),
    GRAM(0.001),
    POUND(0.453592);

    private final double baseUnitConversionFactor;

    WeightUnit(double baseUnitConversionFactor) {
        this.baseUnitConversionFactor = baseUnitConversionFactor;
    }

    public double convertToBaseUnit(double value) {
        return value * this.baseUnitConversionFactor;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / this.baseUnitConversionFactor;
    }
}
