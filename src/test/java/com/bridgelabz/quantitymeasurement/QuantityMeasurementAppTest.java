package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(0.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeet_ShouldReturnNotEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(0.0);
        assertNotEquals(feet1, null);
    }

    @Test
    public void givenSameReference_ShouldReturnEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(0.0);
        assertEquals(feet1, feet1);
    }

    @Test
    public void givenDifferentType_ShouldReturnNotEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(0.0);
        assertNotEquals(feet1, new Object());
    @Test
    public void given0InchesAnd0Inches_ShouldReturnEqual() {
        QuantityMeasurementApp.Inches inch1 = new QuantityMeasurementApp.Inches(0.0);
        QuantityMeasurementApp.Inches inch2 = new QuantityMeasurementApp.Inches(0.0);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchesAnd1Inches_ShouldReturnNotEqual() {
        QuantityMeasurementApp.Inches inch1 = new QuantityMeasurementApp.Inches(0.0);
        QuantityMeasurementApp.Inches inch2 = new QuantityMeasurementApp.Inches(1.0);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInches_ShouldReturnNotEqual() {
        QuantityMeasurementApp.Inches inch1 = new QuantityMeasurementApp.Inches(0.0);
        assertNotEquals(inch1, null);
    }

    @Test
    public void givenSameReferenceInches_ShouldReturnEqual() {
        QuantityMeasurementApp.Inches inch1 = new QuantityMeasurementApp.Inches(0.0);
        assertEquals(inch1, inch1);
    }

    @Test
    public void givenDifferentTypeInches_ShouldReturnNotEqual() {
        QuantityMeasurementApp.Inches inch1 = new QuantityMeasurementApp.Inches(0.0);
        assertNotEquals(inch1, new Object());
    }

    @Test
    public void given0FeetAnd0Inches_ShouldReturnEqual() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(0.0);
        assertEquals(feet, inches);
    }

    @Test
    public void given1FeetAnd12Inches_ShouldReturnEqual() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(12.0);
        assertEquals(feet, inches);
    }
}
