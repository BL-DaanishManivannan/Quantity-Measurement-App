package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityWeightTest {
    @Test
    public void given1KgAnd1000Grams_ShouldReturnEqual() {
        Quantity<WeightUnit> kg = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> grams = new Quantity<>(1000.0, WeightUnit.GRAM);
        assertEquals(kg, grams);
    }

    @Test
    public void given1Kg_WhenConvertedToGrams_ShouldReturn1000Grams() {
        Quantity<WeightUnit> kg = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> grams = kg.convertTo(WeightUnit.GRAM);
        assertEquals(new Quantity<>(1000.0, WeightUnit.GRAM), grams);
    }

    @Test
    public void given1KgAnd200Grams_WhenAdded_ShouldReturn1200Grams() {
        Quantity<WeightUnit> kg = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> grams = new Quantity<>(200.0, WeightUnit.GRAM);
        Quantity<WeightUnit> sum = kg.add(grams, WeightUnit.GRAM);
        assertEquals(new Quantity<>(1200.0, WeightUnit.GRAM), sum);
    }

    @Test
    public void given1Lb_WhenConvertedToKg_ShouldReturnApprox045Kg() {
        Quantity<WeightUnit> lb = new Quantity<>(1.0, WeightUnit.POUND);
        Quantity<WeightUnit> kg = lb.convertTo(WeightUnit.KILOGRAM);
        assertEquals(new Quantity<>(0.45, WeightUnit.KILOGRAM), kg);
    }
}
