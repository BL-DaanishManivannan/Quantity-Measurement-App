package com.bridgelabz.quantitymeasurement;

public enum TemperatureUnit implements IMeasurable {
    CELSIUS {
        @Override
        public double convertToBaseUnit(double value) {
            return value;
        }

        @Override
        public double convertFromBaseUnit(double baseValue) {
            return baseValue;
        }
    },
    FAHRENHEIT {
        @Override
        public double convertToBaseUnit(double value) {
            return (value - 32) * 5 / 9.0;
        }

        @Override
        public double convertFromBaseUnit(double baseValue) {
            return (baseValue * 9 / 5.0) + 32;
        }
    };

    @Override
    public boolean supportsArithmetic() {
        return false;
    }
}
