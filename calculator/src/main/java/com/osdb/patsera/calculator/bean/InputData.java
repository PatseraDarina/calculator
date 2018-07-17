package com.osdb.patsera.calculator.bean;

import java.util.Objects;

public class InputData {

    private Operation operation;
    private Double a;
    private Double b;
    private Double c;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputData inputData = (InputData) o;
        return operation == inputData.operation &&
                Objects.equals(a, inputData.a) &&
                Objects.equals(b, inputData.b) &&
                Objects.equals(c, inputData.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, a, b, c);
    }
}
