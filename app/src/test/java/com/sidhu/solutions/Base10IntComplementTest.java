package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Base10IntComplementTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"5, 2", "7, 0", "10, 5"})
    public void test(int input, int expected) {
        solution = new Base10IntComplement();
        boolean result = solution.test(() -> {
            int actual = ((Base10IntComplement) solution).bitwiseComplement(input);
            System.out.println("Input: " + input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

}
