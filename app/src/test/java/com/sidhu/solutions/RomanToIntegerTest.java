package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanToIntegerTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"III, 3", "LVIII, 58", "MCMXCIV, 1994"})
    public void test(String input, int expected) {
        solution = new RomanToInteger();
        boolean result = solution.test(() -> {
            int actual = ((RomanToInteger) solution).romanToInt(input);
            System.out.println("Input: " + input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }
}
