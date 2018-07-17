package com.osdb.patsera.calculator.service.impl;

import com.osdb.patsera.calculator.bean.InputData;
import com.osdb.patsera.calculator.bean.Operation;
import com.osdb.patsera.calculator.bean.ResultData;
import com.osdb.patsera.calculator.service.CalculatorService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Cacheable("results")
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public ResultData add(InputData inputData) {
        Double calculationResult = inputData.getA() + inputData.getB() + inputData.getC();
        inputData.setOperation(Operation.ADD);
        return getResultData(inputData, calculationResult);
    }

    @Override
    public ResultData subtract(InputData inputData) {
        Double calculationResult = inputData.getA() - inputData.getB() - inputData.getC();
        inputData.setOperation(Operation.SUBTRACT);
        return getResultData(inputData, calculationResult);
    }

    @Override
    public ResultData multiply(InputData inputData) {
        Double calculationResult = inputData.getA() * inputData.getB() * inputData.getC();
        inputData.setOperation(Operation.MULTIPLY);
        return getResultData(inputData, calculationResult);
    }

    @Override
    public ResultData divide(InputData inputData) {
        Double calculationResult = inputData.getA() / inputData.getB();
        inputData.setOperation(Operation.DIVIDE);
        return getResultData(inputData, calculationResult);
    }

    private ResultData getResultData(InputData inputData, Double calculationResult) {
        ResultData resultData = new ResultData();
        resultData.setInputData(inputData);
        resultData.setCalculationResult(calculationResult);
        return resultData;
    }
}
