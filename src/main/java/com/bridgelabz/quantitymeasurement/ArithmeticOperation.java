package com.bridgelabz.quantitymeasurement;

import java.util.function.DoubleBinaryOperator;

public enum ArithmeticOperation {
    ADD((a, b) -> a + b, true),
    SUBTRACT((a, b) -> a - b, true),
    DIVIDE((a, b) -> {
        if (b == 0.0) throw new ArithmeticException("Division by zero");
        return a / b;
    }, false);

    private final DoubleBinaryOperator operator;
    private final boolean shouldRound;

    ArithmeticOperation(DoubleBinaryOperator operator, boolean shouldRound) {
        this.operator = operator;
        this.shouldRound = shouldRound;
    }

    public double apply(double a, double b) {
        return operator.applyAsDouble(a, b);
    }

    public boolean shouldRound() {
        return shouldRound;
    }
}
