package com.osdb.patsera.calculator.bean;

import java.util.Objects;

public class ResultData {

    private InputData inputData;
    private Double calculationResult;

    public InputData getInputData() {
        return inputData;
    }

    public void setInputData(InputData inputData) {
        this.inputData = inputData;
    }

    public Double getCalculationResult() {
        return calculationResult;
    }

    public void setCalculationResult(Double calculationResult) {
        this.calculationResult = calculationResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultData that = (ResultData) o;
        return Objects.equals(inputData, that.inputData) &&
                Objects.equals(calculationResult, that.calculationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputData, calculationResult);
    }
}
