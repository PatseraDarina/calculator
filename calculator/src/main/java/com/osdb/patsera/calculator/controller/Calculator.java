package com.osdb.patsera.calculator.controller;

import com.osdb.patsera.calculator.bean.InputData;
import com.osdb.patsera.calculator.bean.Operation;
import com.osdb.patsera.calculator.bean.ResultData;
import com.osdb.patsera.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class Calculator {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(value = "/add/{a}/{b}/{c}")
    public ResponseEntity<ResultData> add(@PathVariable Double a, @PathVariable Double b, @PathVariable Double c, InputData inputData) {
        inputData.setOperation(Operation.ADD);
        ResultData resultData = calculatorService.add(inputData);
        return new ResponseEntity<>(resultData, HttpStatus.OK);
    }

    @GetMapping(value = "/subtract/{a}/{b}/{c}")
    public ResponseEntity<ResultData> subtract(@PathVariable Double a, @PathVariable Double b, @PathVariable Double c, InputData inputData) {
        inputData.setOperation(Operation.SUBTRACT);
        ResultData resultData = calculatorService.subtract(inputData);
        return new ResponseEntity<>(resultData, HttpStatus.OK);
    }

    @GetMapping(value = "/multiply/{a}/{b}/{c}")
    public ResponseEntity<ResultData> multiply(@PathVariable Double a, @PathVariable Double b, @PathVariable Double c, InputData inputData) {
        inputData.setOperation(Operation.MULTIPLY);
        ResultData resultData = calculatorService.multiply(inputData);
        return new ResponseEntity<>(resultData, HttpStatus.OK);
    }

    @GetMapping(value = "/divide/{a}/{b}")
    public ResponseEntity<ResultData> divide(@PathVariable Double a, @PathVariable Double b, InputData inputData) {
        inputData.setOperation(Operation.DIVIDE);
        ResultData resultData = calculatorService.divide(inputData);
        return new ResponseEntity<>(resultData, HttpStatus.OK);
    }
}
