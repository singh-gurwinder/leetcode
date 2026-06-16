package com.sidhu.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringSpecialOperationsTest {

    private Solution solution;

    @ParameterizedTest
    @CsvSource({"a#b%*, ba", "z*#, ''"})
    public void test(String s, String expected) {
        solution = new StringSpecialOperations();
        boolean result = solution.test(() -> {
            String actual = ((StringSpecialOperations) solution).processStr(s);
            System.out.println("Input : " + s);
            System.out.println("Expected : " + expected);
            System.out.println("Actual : " + actual);
            return actual.equals(expected);
        });
        System.out.println("Test passes : " + result);
        assertTrue(result);
    }
}
