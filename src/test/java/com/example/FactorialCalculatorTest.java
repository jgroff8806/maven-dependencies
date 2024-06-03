package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {
    @Test
    public void testFactorial() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
    }
}
