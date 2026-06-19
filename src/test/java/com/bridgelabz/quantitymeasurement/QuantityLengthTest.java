package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityLengthTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity<LengthUnit> feet1 = new Quantity<>(0.0, LengthUnit.FEET);
        Quantity<LengthUnit> feet2 = new Quantity<>(0.0, LengthUnit.FEET);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity<LengthUnit> feet1 = new Quantity<>(0.0, LengthUnit.FEET);
        Quantity<LengthUnit> feet2 = new Quantity<>(1.0, LengthUnit.FEET);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeet_ShouldReturnNotEqual() {
        Quantity<LengthUnit> feet1 = new Quantity<>(0.0, LengthUnit.FEET);
        assertNotEquals(feet1, null);
    }

    @Test
    public void givenSameReferenceFeet_ShouldReturnEqual() {
        Quantity<LengthUnit> feet1 = new Quantity<>(0.0, LengthUnit.FEET);
        assertEquals(feet1, feet1);
    }

    @Test
    public void givenDifferentTypeFeet_ShouldReturnNotEqual() {
        Quantity<LengthUnit> feet1 = new Quantity<>(0.0, LengthUnit.FEET);
        assertNotEquals(feet1, new Object());
    }

    @Test
    public void given0InchesAnd0Inches_ShouldReturnEqual() {
        Quantity<LengthUnit> inch1 = new Quantity<>(0.0, LengthUnit.INCHES);
        Quantity<LengthUnit> inch2 = new Quantity<>(0.0, LengthUnit.INCHES);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchesAnd1Inches_ShouldReturnNotEqual() {
        Quantity<LengthUnit> inch1 = new Quantity<>(0.0, LengthUnit.INCHES);
        Quantity<LengthUnit> inch2 = new Quantity<>(1.0, LengthUnit.INCHES);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInches_ShouldReturnNotEqual() {
        Quantity<LengthUnit> inch1 = new Quantity<>(0.0, LengthUnit.INCHES);
        assertNotEquals(inch1, null);
    }

    @Test
    public void givenSameReferenceInches_ShouldReturnEqual() {
        Quantity<LengthUnit> inch1 = new Quantity<>(0.0, LengthUnit.INCHES);
        assertEquals(inch1, inch1);
    }

    @Test
    public void givenDifferentTypeInches_ShouldReturnNotEqual() {
        Quantity<LengthUnit> inch1 = new Quantity<>(0.0, LengthUnit.INCHES);
        assertNotEquals(inch1, new Object());
    }

    @Test
    public void given0FeetAnd0Inches_ShouldReturnEqual() {
        Quantity<LengthUnit> feet = new Quantity<>(0.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = new Quantity<>(0.0, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void given1FeetAnd12Inches_ShouldReturnEqual() {
        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = new Quantity<>(12.0, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnEqual() {
        Quantity<LengthUnit> inches = new Quantity<>(12.0, LengthUnit.INCHES);
        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        assertEquals(inches, feet);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Quantity<LengthUnit> feet = new Quantity<>(3.0, LengthUnit.FEET);
        Quantity<LengthUnit> yard = new Quantity<>(1.0, LengthUnit.YARDS);
        assertEquals(feet, yard);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Quantity<LengthUnit> yard = new Quantity<>(1.0, LengthUnit.YARDS);
        Quantity<LengthUnit> feet = new Quantity<>(3.0, LengthUnit.FEET);
        assertEquals(yard, feet);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnEqual() {
        Quantity<LengthUnit> yard = new Quantity<>(1.0, LengthUnit.YARDS);
        Quantity<LengthUnit> inches = new Quantity<>(36.0, LengthUnit.INCHES);
        assertEquals(yard, inches);
    }

    @Test
    public void given36InchesAnd1Yard_ShouldReturnEqual() {
        Quantity<LengthUnit> inches = new Quantity<>(36.0, LengthUnit.INCHES);
        Quantity<LengthUnit> yard = new Quantity<>(1.0, LengthUnit.YARDS);
        assertEquals(inches, yard);
    }

    @Test
    public void given1YardAnd1Yard_ShouldReturnEqual() {
        Quantity<LengthUnit> yard1 = new Quantity<>(1.0, LengthUnit.YARDS);
        Quantity<LengthUnit> yard2 = new Quantity<>(1.0, LengthUnit.YARDS);
        assertEquals(yard1, yard2);
    }

    @Test
    public void given2InchesAnd5Cm_ShouldReturnEqual() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> cm = new Quantity<>(5.0, LengthUnit.CENTIMETERS);
        assertEquals(inches, cm);
    }

    @Test
    public void given1Feet_WhenConvertedToInches_ShouldReturn12Inches() {
        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = feet.convertTo(LengthUnit.INCHES);
        assertEquals(new Quantity<>(12.0, LengthUnit.INCHES), inches);
    }

    @Test
    public void given3Feet_WhenConvertedToYards_ShouldReturn1Yard() {
        Quantity<LengthUnit> feet = new Quantity<>(3.0, LengthUnit.FEET);
        Quantity<LengthUnit> yards = feet.convertTo(LengthUnit.YARDS);
        assertEquals(new Quantity<>(1.0, LengthUnit.YARDS), yards);
    }

    @Test
    public void given1Yard_WhenConvertedToInches_ShouldReturn36Inches() {
        Quantity<LengthUnit> yard = new Quantity<>(1.0, LengthUnit.YARDS);
        Quantity<LengthUnit> inches = yard.convertTo(LengthUnit.INCHES);
        assertEquals(new Quantity<>(36.0, LengthUnit.INCHES), inches);
    }

    @Test
    public void given2Inches_WhenConvertedToCentimeters_ShouldReturn5Cm() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> cm = inches.convertTo(LengthUnit.CENTIMETERS);
        assertEquals(new Quantity<>(5.08, LengthUnit.CENTIMETERS), cm);
    }

    @Test
    public void givenNullTargetUnit_WhenConverted_ShouldThrowException() {
        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        assertThrows(IllegalArgumentException.class, () -> feet.convertTo(null));
    }

    @Test
    public void given2InchesAnd2Inches_WhenAdded_ShouldReturn4Inches() {
        Quantity<LengthUnit> inches1 = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> inches2 = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> sum = inches1.add(inches2);
        assertEquals(new Quantity<>(4.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void given1FootAnd2Inches_WhenAdded_ShouldReturn14Inches() {
        // Wait, if first operand is inches and second is feet
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> sum = inches.add(feet);
        assertEquals(new Quantity<>(14.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void given1FootAnd1Foot_WhenAdded_ShouldReturn2Feet() {
        Quantity<LengthUnit> feet1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> feet2 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> sum = feet1.add(feet2);
        assertEquals(new Quantity<>(2.0, LengthUnit.FEET), sum);
    }

    @Test
    public void given2InchesAnd2AndHalfCm_WhenAdded_ShouldReturn3Inches() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> cm = new Quantity<>(2.5, LengthUnit.CENTIMETERS);
        Quantity<LengthUnit> sum = inches.add(cm);
        assertEquals(new Quantity<>(3.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void givenNull_WhenAdded_ShouldThrowException() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        assertThrows(IllegalArgumentException.class, () -> inches.add(null));
    }

    @Test
    public void given1FootAnd1Foot_WhenAddedWithTargetUnitInches_ShouldReturn24Inches() {
        Quantity<LengthUnit> feet1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> feet2 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> sum = feet1.add(feet2, LengthUnit.INCHES);
        assertEquals(new Quantity<>(24.0, LengthUnit.INCHES), sum);
    }

    @Test
    public void given2InchesAnd2AndHalfCm_WhenAddedWithTargetUnitCm_ShouldReturn7AndHalfCm() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> cm = new Quantity<>(2.5, LengthUnit.CENTIMETERS);
        Quantity<LengthUnit> sum = inches.add(cm, LengthUnit.CENTIMETERS);
        assertEquals(new Quantity<>(7.58, LengthUnit.CENTIMETERS), sum);
    }

    @Test
    public void givenNullTargetUnitInAdd_ShouldThrowException() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> cm = new Quantity<>(2.5, LengthUnit.CENTIMETERS);
        assertThrows(IllegalArgumentException.class, () -> inches.add(cm, null));
    }

    @Test
    public void given2InchesAnd1Inch_WhenSubtracted_ShouldReturn1Inch() {
        Quantity<LengthUnit> inches2 = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> inches1 = new Quantity<>(1.0, LengthUnit.INCHES);
        Quantity<LengthUnit> diff = inches2.subtract(inches1);
        assertEquals(new Quantity<>(1.0, LengthUnit.INCHES), diff);
    }

    @Test
    public void given2InchesAnd2AndHalfCm_WhenSubtracted_ShouldReturn1Inch() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> cm = new Quantity<>(2.5, LengthUnit.CENTIMETERS); // roughly 1 inch
        Quantity<LengthUnit> diff = inches.subtract(cm);
        assertEquals(new Quantity<>(1.02, LengthUnit.INCHES), diff);
    }

    @Test
    public void given2InchesAnd2Inches_WhenDivided_ShouldReturn1() {
        Quantity<LengthUnit> inches1 = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> inches2 = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> quotient = inches1.divide(inches2);
        // It returns a Quantity object, but we expect its internal value to be 1.0.
        // Wait, 1.0 inch? Division of 2 inches by 2 inches mathematically yields a dimensionless 1.0.
        // However, as per UC12, it returns Quantity<U> with the first operand's unit.
        assertEquals(new Quantity<>(1.0, LengthUnit.INCHES), quotient);
    }

    @Test
    public void givenDivisionByZero_ShouldThrowException() {
        Quantity<LengthUnit> inches = new Quantity<>(2.0, LengthUnit.INCHES);
        Quantity<LengthUnit> zero = new Quantity<>(0.0, LengthUnit.INCHES);
        assertThrows(ArithmeticException.class, () -> inches.divide(zero));
    }
}
