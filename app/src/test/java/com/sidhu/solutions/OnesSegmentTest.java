package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OnesSegmentTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"1001, false", "110, true"})
    public void test(String input, boolean expected) {
        solution = new OnesSegment();
        boolean result = solution.test(() -> {
            boolean actual = ((OnesSegment) solution).checkOnesSegment(input);
            System.out.println("Input: " + input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

}
