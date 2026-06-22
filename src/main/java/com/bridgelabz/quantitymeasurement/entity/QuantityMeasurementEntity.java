package com.bridgelabz.quantitymeasurement.entity;

import javax.persistence.*;

@Entity
@Table(name = "quantity_measurement_entity")
public class QuantityMeasurementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double value1;
    private String unit1;
    private double value2;
    private String unit2;
    private String operation;
    private double resultValue;
    private String resultUnit;

    public QuantityMeasurementEntity() {}

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getValue1() { return value1; }
    public void setValue1(double value1) { this.value1 = value1; }
    public String getUnit1() { return unit1; }
    public void setUnit1(String unit1) { this.unit1 = unit1; }
    public double getValue2() { return value2; }
    public void setValue2(double value2) { this.value2 = value2; }
    public String getUnit2() { return unit2; }
    public void setUnit2(String unit2) { this.unit2 = unit2; }
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
    public double getResultValue() { return resultValue; }
    public void setResultValue(double resultValue) { this.resultValue = resultValue; }
    public String getResultUnit() { return resultUnit; }
    public void setResultUnit(String resultUnit) { this.resultUnit = resultUnit; }
}
