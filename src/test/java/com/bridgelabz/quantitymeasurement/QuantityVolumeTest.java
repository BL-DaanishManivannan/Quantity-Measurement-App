package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityVolumeTest {
    @Test
    public void given1GallonAnd3785_41ml_ShouldReturnEqual() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> ml = new Quantity<>(3785.41, VolumeUnit.MILLILITRE);
        assertEquals(gallon, ml);
    }

    @Test
    public void given1LitreAnd1000ml_ShouldReturnEqual() {
        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> ml = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertEquals(litre, ml);
    }

    @Test
    public void given1GallonAnd3_78541Litres_WhenAdded_ShouldReturn7_57082Litres() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> litre = new Quantity<>(3.78541, VolumeUnit.LITRE);
        Quantity<VolumeUnit> sum = gallon.add(litre, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(7.57, VolumeUnit.LITRE), sum);
    }

    @Test
    public void given1LitreAnd1000ml_WhenAdded_ShouldReturn2Litres() {
        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> ml = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> sum = litre.add(ml, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(2.0, VolumeUnit.LITRE), sum);
    }
}
