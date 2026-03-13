package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class CalculatorTest {
	
	@Test
	void calTest() {
		
		Calculator cal = new Calculator();
		
		assertEquals( 10 , cal.add(3, 7));
		
		
	}
	
	@Test
	@Timeout(2)
	void isPrimeTest() {
		Calculator cal = new Calculator();
		
		assertFalse(cal.isPrime(-1));
		assertTrue(cal.isPrime(13));
		
		assertFalse(cal.isPrime(14));
	}
}
