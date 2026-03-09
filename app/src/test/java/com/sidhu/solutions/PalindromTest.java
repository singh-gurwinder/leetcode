package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalindromTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"121, true", "-121, false", "10, false"})
    public void test(int input, boolean expected) {
        solution = new Palindrom();
        boolean result = solution.test(() -> {
            boolean actual = ((Palindrom) solution).isPalindrome(input);
            System.out.println("Original number: " + input);
            System.out.println("Expected Result: " + expected);
            System.out.println("Actual Result: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

}
