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
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double thatValueInBase = that.unit.convertToBaseUnit(that.value);
        return Math.abs(thisValueInBase - thatValueInBase) <= 0.01;
    }

    public QuantityLength convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        double valueInBase = this.unit.convertToBaseUnit(this.value);
        double convertedValue = targetUnit.convertFromBaseUnit(valueInBase);
        return new QuantityLength(Math.round(convertedValue * 100.0) / 100.0, targetUnit);
    }

    public QuantityLength add(QuantityLength other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add null quantity");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = this.unit.convertFromBaseUnit(sumInBase);
        return new QuantityLength(Math.round(resultValue * 100.0) / 100.0, this.unit);
    }

    public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Quantity and Target Unit cannot be null");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = targetUnit.convertFromBaseUnit(sumInBase);
        return new QuantityLength(Math.round(resultValue * 100.0) / 100.0, targetUnit);
    }
}
