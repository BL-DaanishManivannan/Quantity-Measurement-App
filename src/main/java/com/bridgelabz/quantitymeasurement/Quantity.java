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

    public double getValue() { return value; }
    public U getUnit() { return unit; }

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

    private Quantity<U> performBaseArithmetic(Quantity<U> other, ArithmeticOperation operation, U targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException(operation == ArithmeticOperation.DIVIDE ? "Cannot divide by null quantity" : "Quantity and Target Unit cannot be null");
        }
        if (!this.unit.supportsArithmetic() || !other.unit.supportsArithmetic() || !targetUnit.supportsArithmetic()) {
            throw new UnsupportedOperationException("Arithmetic operations are not supported for this unit type");
        }
        double thisValueInBase = this.unit.convertToBaseUnit(this.value);
        double otherValueInBase = other.unit.convertToBaseUnit(other.value);
        double resultInBase = operation.apply(thisValueInBase, otherValueInBase);
        double resultValue = targetUnit.convertFromBaseUnit(resultInBase);
        if (operation.shouldRound()) {
            resultValue = Math.round(resultValue * 100.0) / 100.0;
        }
        return new Quantity<>(resultValue, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other) {
        if (other == null) throw new IllegalArgumentException("Cannot add null quantity");
        return performBaseArithmetic(other, ArithmeticOperation.ADD, this.unit);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        return performBaseArithmetic(other, ArithmeticOperation.ADD, targetUnit);
    }

    public Quantity<U> subtract(Quantity<U> other) {
        if (other == null) throw new IllegalArgumentException("Cannot subtract null quantity");
        return performBaseArithmetic(other, ArithmeticOperation.SUBTRACT, this.unit);
    }

    public Quantity<U> subtract(Quantity<U> other, U targetUnit) {
        return performBaseArithmetic(other, ArithmeticOperation.SUBTRACT, targetUnit);
    }

    public Quantity<U> divide(Quantity<U> other) {
        if (other == null) throw new IllegalArgumentException("Cannot divide by null quantity");
        return performBaseArithmetic(other, ArithmeticOperation.DIVIDE, this.unit);
    }

    public Quantity<U> divide(Quantity<U> other, U targetUnit) {
        return performBaseArithmetic(other, ArithmeticOperation.DIVIDE, targetUnit);
    }
}
