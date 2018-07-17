package com.osdb.patsera.calculator.service;

import com.osdb.patsera.calculator.bean.InputData;
import com.osdb.patsera.calculator.bean.ResultData;

public interface CalculatorService {

    ResultData add(InputData inputData);

    ResultData subtract(InputData inputData);

    ResultData multiply(InputData inputData);

    ResultData divide(InputData inputData);
}
