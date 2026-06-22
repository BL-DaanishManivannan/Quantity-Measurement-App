package com.bridgelabz.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTemperatureTest {

    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEqual() {
        Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212.0, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> celsius = new Quantity<>(100.0, TemperatureUnit.CELSIUS);
        assertEquals(fahrenheit, celsius);
    }

    @Test
    public void given100CelsiusAnd212Fahrenheit_ShouldReturnEqual() {
        Quantity<TemperatureUnit> celsius = new Quantity<>(100.0, TemperatureUnit.CELSIUS);
        Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212.0, TemperatureUnit.FAHRENHEIT);
        assertEquals(celsius, fahrenheit);
    }

    @Test
    public void given212Fahrenheit_WhenConvertedToCelsius_ShouldReturn100Celsius() {
        Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212.0, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> celsius = fahrenheit.convertTo(TemperatureUnit.CELSIUS);
        assertEquals(new Quantity<>(100.0, TemperatureUnit.CELSIUS), celsius);
    }

    @Test
    public void given100Celsius_WhenConvertedToFahrenheit_ShouldReturn212Fahrenheit() {
        Quantity<TemperatureUnit> celsius = new Quantity<>(100.0, TemperatureUnit.CELSIUS);
        Quantity<TemperatureUnit> fahrenheit = celsius.convertTo(TemperatureUnit.FAHRENHEIT);
        assertEquals(new Quantity<>(212.0, TemperatureUnit.FAHRENHEIT), fahrenheit);
    }

    @Test
    public void givenTemperature_WhenAddCalled_ShouldThrowUnsupportedOperationException() {
        Quantity<TemperatureUnit> celsius1 = new Quantity<>(100.0, TemperatureUnit.CELSIUS);
        Quantity<TemperatureUnit> celsius2 = new Quantity<>(50.0, TemperatureUnit.CELSIUS);
        assertThrows(UnsupportedOperationException.class, () -> celsius1.add(celsius2));
    }

    @Test
    public void givenTemperature_WhenSubtractCalled_ShouldThrowUnsupportedOperationException() {
        Quantity<TemperatureUnit> celsius1 = new Quantity<>(100.0, TemperatureUnit.CELSIUS);
        Quantity<TemperatureUnit> celsius2 = new Quantity<>(50.0, TemperatureUnit.CELSIUS);
        assertThrows(UnsupportedOperationException.class, () -> celsius1.subtract(celsius2));
    }
}
