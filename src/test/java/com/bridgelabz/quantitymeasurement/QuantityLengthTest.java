package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityLengthTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityLength feet1 = new QuantityLength(0.0, LengthUnit.FEET);
        QuantityLength feet2 = new QuantityLength(0.0, LengthUnit.FEET);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityLength feet1 = new QuantityLength(0.0, LengthUnit.FEET);
        QuantityLength feet2 = new QuantityLength(1.0, LengthUnit.FEET);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeet_ShouldReturnNotEqual() {
        QuantityLength feet1 = new QuantityLength(0.0, LengthUnit.FEET);
        assertNotEquals(feet1, null);
    }

    @Test
    public void givenSameReferenceFeet_ShouldReturnEqual() {
        QuantityLength feet1 = new QuantityLength(0.0, LengthUnit.FEET);
        assertEquals(feet1, feet1);
    }

    @Test
    public void givenDifferentTypeFeet_ShouldReturnNotEqual() {
        QuantityLength feet1 = new QuantityLength(0.0, LengthUnit.FEET);
        assertNotEquals(feet1, new Object());
    }

    @Test
    public void given0InchesAnd0Inches_ShouldReturnEqual() {
        QuantityLength inch1 = new QuantityLength(0.0, LengthUnit.INCHES);
        QuantityLength inch2 = new QuantityLength(0.0, LengthUnit.INCHES);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchesAnd1Inches_ShouldReturnNotEqual() {
        QuantityLength inch1 = new QuantityLength(0.0, LengthUnit.INCHES);
        QuantityLength inch2 = new QuantityLength(1.0, LengthUnit.INCHES);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInches_ShouldReturnNotEqual() {
        QuantityLength inch1 = new QuantityLength(0.0, LengthUnit.INCHES);
        assertNotEquals(inch1, null);
    }

    @Test
    public void givenSameReferenceInches_ShouldReturnEqual() {
        QuantityLength inch1 = new QuantityLength(0.0, LengthUnit.INCHES);
        assertEquals(inch1, inch1);
    }

    @Test
    public void givenDifferentTypeInches_ShouldReturnNotEqual() {
        QuantityLength inch1 = new QuantityLength(0.0, LengthUnit.INCHES);
        assertNotEquals(inch1, new Object());
    }

    @Test
    public void given0FeetAnd0Inches_ShouldReturnEqual() {
        QuantityLength feet = new QuantityLength(0.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(0.0, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void given1FeetAnd12Inches_ShouldReturnEqual() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnEqual() {
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCHES);
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals(inches, feet);
    }
}
