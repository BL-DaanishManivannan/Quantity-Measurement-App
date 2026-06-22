package com.bridgelabz.quantitymeasurement;

public class QuantityWeight {
    private final double value;
    private final WeightUnit unit;

    public QuantityWeight(double value, WeightUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        QuantityWeight that = (QuantityWeight) obj;
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double thatValueInBase = that.unit.convertToBaseUnit(that.value);
        return Math.abs(thisValueInBase - thatValueInBase) <= 0.01;
    }

    public QuantityWeight convertTo(WeightUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        double valueInBase = this.unit.convertToBaseUnit(this.value);
        double convertedValue = targetUnit.convertFromBaseUnit(valueInBase);
        return new QuantityWeight(Math.round(convertedValue * 100.0) / 100.0, targetUnit);
    }

    public QuantityWeight add(QuantityWeight other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add null quantity");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = this.unit.convertFromBaseUnit(sumInBase);
        return new QuantityWeight(Math.round(resultValue * 100.0) / 100.0, this.unit);
    }

    public QuantityWeight add(QuantityWeight other, WeightUnit targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Quantity and Target Unit cannot be null");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = targetUnit.convertFromBaseUnit(sumInBase);
        return new QuantityWeight(Math.round(resultValue * 100.0) / 100.0, targetUnit);
    }
}
