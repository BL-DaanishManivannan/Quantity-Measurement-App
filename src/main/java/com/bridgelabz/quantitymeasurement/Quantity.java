package com.bridgelabz.quantitymeasurement;

public class Quantity<U extends IMeasurable> {
    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {
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
        Quantity<?> that = (Quantity<?>) obj;
        if (!this.unit.getClass().equals(that.unit.getClass())) return false;
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double thatValueInBase = ((IMeasurable) that.unit).convertToBaseUnit(that.value);
        return Math.abs(thisValueInBase - thatValueInBase) <= 0.01;
    }

    public Quantity<U> convertTo(U targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        double valueInBase = this.unit.convertToBaseUnit(this.value);
        double convertedValue = targetUnit.convertFromBaseUnit(valueInBase);
        return new Quantity<>(Math.round(convertedValue * 100.0) / 100.0, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add null quantity");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = this.unit.convertFromBaseUnit(sumInBase);
        return new Quantity<>(Math.round(resultValue * 100.0) / 100.0, this.unit);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Quantity and Target Unit cannot be null");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double sumInBase = thisValueInBase + otherValueInBase;
        double resultValue = targetUnit.convertFromBaseUnit(sumInBase);
        return new Quantity<>(Math.round(resultValue * 100.0) / 100.0, targetUnit);
    public Quantity<U> subtract(Quantity<U> other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot subtract null quantity");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double resultInBase = thisValueInBase - otherValueInBase;
        double resultValue = this.unit.convertFromBaseUnit(resultInBase);
        return new Quantity<>(Math.round(resultValue * 100.0) / 100.0, this.unit);
    }

    public Quantity<U> subtract(Quantity<U> other, U targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Quantity and Target Unit cannot be null");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double resultInBase = thisValueInBase - otherValueInBase;
        double resultValue = targetUnit.convertFromBaseUnit(resultInBase);
        return new Quantity<>(Math.round(resultValue * 100.0) / 100.0, targetUnit);
    }

    public Quantity<U> divide(Quantity<U> other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot divide by null quantity");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        if (otherValueInBase == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        double resultInBase = thisValueInBase / otherValueInBase;
        double resultValue = this.unit.convertFromBaseUnit(resultInBase);
        return new Quantity<>(resultValue, this.unit); // No rounding for divide
    }

    public Quantity<U> divide(Quantity<U> other, U targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Quantity and Target Unit cannot be null");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        if (otherValueInBase == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        double resultInBase = thisValueInBase / otherValueInBase;
        double resultValue = targetUnit.convertFromBaseUnit(resultInBase);
        return new Quantity<>(resultValue, targetUnit); // No rounding for divide
    }
}
