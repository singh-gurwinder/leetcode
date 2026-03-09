package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class KthBitInNthBinaryStringTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"3, 1, 0", "4, 11, 1"})
    public void test(int n, int k, char expected) {
        solution = new KthBitInNthBinaryString();
        boolean result = solution.test(() -> {
            char actual = ((KthBitInNthBinaryString) solution).findKthBit(n, k);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

}
