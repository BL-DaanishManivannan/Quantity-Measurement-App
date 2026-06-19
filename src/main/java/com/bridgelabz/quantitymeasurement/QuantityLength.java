package com.bridgelabz.quantitymeasurement;

public class QuantityLength {
    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        QuantityLength that = (QuantityLength) obj;
        double thisValueInBase = this.value * this.unit.getConversionFactor();
        double thatValueInBase = that.value * that.unit.getConversionFactor();
        return Math.abs(thisValueInBase - thatValueInBase) <= 0.01;
    }

    public QuantityLength convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        double valueInBase = this.value * this.unit.getConversionFactor();
        double convertedValue = valueInBase / targetUnit.getConversionFactor();
        return new QuantityLength(Math.round(convertedValue * 100.0) / 100.0, targetUnit);
    }
}
