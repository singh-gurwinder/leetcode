package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ZigzagConversionTest {
    
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"PAYPALISHIRING, 3, PAHNAPLSIIGYIR", "PAYPALISHIRING, 4, PINALSIGYAHRPI"})
    public void test(String s, int numRows, String expected) {
        solution = new ZigzagConversion();
        boolean result = solution.test(() -> {
            String actual = ((ZigzagConversion) solution).convert(s, numRows);
            System.out.println("Input : " + s);
            System.out.println("Expected : " + expected);
            System.out.println("Actual : " + actual);
            return expected.equals(expected);
        });
        System.out.println("Test passes : " + result);
        assertTrue(result);
    }
}
