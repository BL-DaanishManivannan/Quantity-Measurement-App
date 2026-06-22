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

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        QuantityLength feet = new QuantityLength(3.0, LengthUnit.FEET);
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARDS);
        assertEquals(feet, yard);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength feet = new QuantityLength(3.0, LengthUnit.FEET);
        assertEquals(yard, feet);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnEqual() {
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength inches = new QuantityLength(36.0, LengthUnit.INCHES);
        assertEquals(yard, inches);
    }

    @Test
    public void given36InchesAnd1Yard_ShouldReturnEqual() {
        QuantityLength inches = new QuantityLength(36.0, LengthUnit.INCHES);
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARDS);
        assertEquals(inches, yard);
    }

    @Test
    public void given1YardAnd1Yard_ShouldReturnEqual() {
        QuantityLength yard1 = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength yard2 = new QuantityLength(1.0, LengthUnit.YARDS);
        assertEquals(yard1, yard2);
    }

    @Test
    public void given2InchesAnd5Cm_ShouldReturnEqual() {
        QuantityLength inches = new QuantityLength(2.0, LengthUnit.INCHES);
        QuantityLength cm = new QuantityLength(5.0, LengthUnit.CENTIMETERS);
        assertEquals(inches, cm);
    }

    @Test
    public void given1Feet_WhenConvertedToInches_ShouldReturn12Inches() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = feet.convertTo(LengthUnit.INCHES);
        assertEquals(new QuantityLength(12.0, LengthUnit.INCHES), inches);
    }

    @Test
    public void given3Feet_WhenConvertedToYards_ShouldReturn1Yard() {
        QuantityLength feet = new QuantityLength(3.0, LengthUnit.FEET);
        QuantityLength yards = feet.convertTo(LengthUnit.YARDS);
        assertEquals(new QuantityLength(1.0, LengthUnit.YARDS), yards);
    }

    @Test
    public void given1Yard_WhenConvertedToInches_ShouldReturn36Inches() {
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength inches = yard.convertTo(LengthUnit.INCHES);
        assertEquals(new QuantityLength(36.0, LengthUnit.INCHES), inches);
    }

    @Test
    public void given2Inches_WhenConvertedToCentimeters_ShouldReturn5Cm() {
        QuantityLength inches = new QuantityLength(2.0, LengthUnit.INCHES);
        QuantityLength cm = inches.convertTo(LengthUnit.CENTIMETERS);
        assertEquals(new QuantityLength(5.08, LengthUnit.CENTIMETERS), cm);
    }

    @Test
    public void givenNullTargetUnit_WhenConverted_ShouldThrowException() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        assertThrows(IllegalArgumentException.class, () -> feet.convertTo(null));
    }

    @Test
    public void given2InchesAnd2Inches_WhenAdded_ShouldReturn4Inches() {
        QuantityLength inches1 = new QuantityLength(2.0, LengthUnit.INCHES);
        QuantityLength inches2 = new QuantityLength(2.0, LengthUnit.INCHES);
        QuantityLength sum = inches1.add(inches2);
        assertEquals(new QuantityLength(4.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void given1FootAnd2Inches_WhenAdded_ShouldReturn14Inches() {
        // Wait, if first operand is inches and second is feet
        QuantityLength inches = new QuantityLength(2.0, LengthUnit.INCHES);
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength sum = inches.add(feet);
        assertEquals(new QuantityLength(14.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void given1FootAnd1Foot_WhenAdded_ShouldReturn2Feet() {
        QuantityLength feet1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength feet2 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength sum = feet1.add(feet2);
        assertEquals(new QuantityLength(2.0, LengthUnit.FEET), sum);
    }

    @Test
    public void given2InchesAnd2AndHalfCm_WhenAdded_ShouldReturn3Inches() {
        QuantityLength inches = new QuantityLength(2.0, LengthUnit.INCHES);
        QuantityLength cm = new QuantityLength(2.5, LengthUnit.CENTIMETERS);
        QuantityLength sum = inches.add(cm);
        assertEquals(new QuantityLength(3.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void givenNull_WhenAdded_ShouldThrowException() {
        QuantityLength inches = new QuantityLength(2.0, LengthUnit.INCHES);
        assertThrows(IllegalArgumentException.class, () -> inches.add(null));
    }
}
