package com.cg;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalTest {
    Calculator cal;

    @BeforeEach
    void init() {
        cal = new Calculator();
        System.out.println("Calculator Object Created");
    }


    @AfterEach
    void destroy() {
        cal = null;
        System.out.println("Calculator Object Destroyed");
    }


    @Test
    @DisplayName(value = "Test calculate")
    @ParameterizedTest
    @CsvSource({"2, 4, 6", "6, 5, 11", "10, 15, 25"})
    void calTest(int num1, int num2, int result){
        // Test case 1:
        assertEquals(11, cal.add(7, 4));

        // Test case 2:
        System.out.println("Testing calculate method");
        assertEquals(10, cal.add(7, 3));

        assertEquals(result, cal.add(num1, num2));
    }

    // @Test
    // @Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
    // @Disabled
    @ParameterizedTest()
    @ValueSource(ints = {13, 17, 23, 53})
    void isPrimeTest(int num){

         System.out.println("Testing isPrime method");
         assertEquals(true, cal.isPrime(7));
         assertEquals(false, cal.isPrime(4));
         assertTrue(cal.isPrime(3));
         assertFalse(cal.isPrime(4));
         assertFalse( cal.isPrime(-5));

         assertEquals(true, cal.isPrime(num));
         assertTrue(cal.isPrime(num));
    }
}
