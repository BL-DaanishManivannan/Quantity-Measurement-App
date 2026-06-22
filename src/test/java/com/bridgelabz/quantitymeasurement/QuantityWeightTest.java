package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityWeightTest {
    @Test
    public void given1KgAnd1000Grams_ShouldReturnEqual() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight grams = new QuantityWeight(1000.0, WeightUnit.GRAM);
        assertEquals(kg, grams);
    }

    @Test
    public void given1Kg_WhenConvertedToGrams_ShouldReturn1000Grams() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight grams = kg.convertTo(WeightUnit.GRAM);
        assertEquals(new QuantityWeight(1000.0, WeightUnit.GRAM), grams);
    }

    @Test
    public void given1KgAnd200Grams_WhenAdded_ShouldReturn1200Grams() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight grams = new QuantityWeight(200.0, WeightUnit.GRAM);
        QuantityWeight sum = kg.add(grams, WeightUnit.GRAM);
        assertEquals(new QuantityWeight(1200.0, WeightUnit.GRAM), sum);
    }

    @Test
    public void given1Lb_WhenConvertedToKg_ShouldReturnApprox045Kg() {
        QuantityWeight lb = new QuantityWeight(1.0, WeightUnit.POUND);
        QuantityWeight kg = lb.convertTo(WeightUnit.KILOGRAM);
        assertEquals(new QuantityWeight(0.45, WeightUnit.KILOGRAM), kg);
    }
}
