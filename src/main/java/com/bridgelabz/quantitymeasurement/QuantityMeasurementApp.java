package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurementApp {
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() == obj.getClass()) {
                Feet feet = (Feet) obj;
                return Double.compare(feet.value, value) == 0;
            }
            if (obj instanceof Inches) {
                Inches inches = (Inches) obj;
                return Double.compare(inches.getValue(), value * 12.0) == 0;
            }
            return false;
        }

        public double getValue() {
            return value;
        }
    }

    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() == obj.getClass()) {
                Inches inches = (Inches) obj;
                return Double.compare(inches.value, value) == 0;
            }
            if (obj instanceof Feet) {
                Feet feet = (Feet) obj;
                return Double.compare(feet.getValue() * 12.0, value) == 0;
            }
            return false;
        }

        public double getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Quantity Measurement Application");
    }
}
