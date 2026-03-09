package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NoRepeatLongestSubstrTest {
    
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"abcabcbb, 3", "bbbbb, 1", "pwwkew, 3"})
    public void test(String input, int expected) {
        solution = new NoRepeatLongestSubstr();
        boolean result = solution.test(() -> {
            int actual = ((NoRepeatLongestSubstr) solution).lengthOfLongestSubstring(input);
            System.out.println("Input : '" + input + "'");
            System.out.println("Expected : " + expected);
            System.out.println("Actual : " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

}
