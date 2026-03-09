package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MinAltBinaryStringTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"0100, 1", "10, 0", "1111, 2"})
    public void test(String input, int expected) {
        solution = new MinAltBinaryString();
        boolean result = solution.test(() -> {
            int actual = ((MinAltBinaryString) solution).minOperations(input);
            System.out.println("Input: " + input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

}
