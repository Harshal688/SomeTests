package com.blue.Calculator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorServicetest {
	
	@Test
	public void performAdditiontest() {
		
		//create a mock object for calculator
		
		Calculator mockCalculator = mock(Calculator.class);
		
		//stub the add method to return a specific value.
		
		when(mockCalculator.add(1, 2)).thenReturn(3);
		
		//Inject the mockcalculator to the mockservice.
		
		CalculatorService service = new CalculatorService(mockCalculator);
		
		//call the perform addition method and assert the result.
		
		int result = service.performAddition(1, 2);
		
		Assertions.assertEquals(3, result);
		
		//Verify that add method was called on the mock calculator
		verify(mockCalculator).add(1, 2);	
	}
}
