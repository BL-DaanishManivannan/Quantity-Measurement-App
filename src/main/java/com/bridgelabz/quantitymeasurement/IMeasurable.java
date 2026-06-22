package com.bridgelabz.quantitymeasurement;

public interface IMeasurable {
    double convertToBaseUnit(double value);
    double convertFromBaseUnit(double baseValue);
}
