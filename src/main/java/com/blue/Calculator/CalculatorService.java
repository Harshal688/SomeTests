package com.blue.Calculator;

public class CalculatorService {
	
	private final Calculator calculator ;
	
	public CalculatorService(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public int performAddition(int a, int b) {
		return calculator.add(a, b);
	}
}
