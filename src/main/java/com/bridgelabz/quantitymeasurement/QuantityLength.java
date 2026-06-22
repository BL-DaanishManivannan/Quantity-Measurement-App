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

    public QuantityLength add(QuantityLength other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add null quantity");
        }
        double thisValueInBase = this.value * this.unit.getConversionFactor();
        double otherValueInBase = other.value * other.unit.getConversionFactor();
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = sumInBase / this.unit.getConversionFactor();
        return new QuantityLength(Math.round(resultValue * 100.0) / 100.0, this.unit);
    }
}
