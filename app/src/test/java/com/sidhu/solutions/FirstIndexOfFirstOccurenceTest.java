package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FirstIndexOfFirstOccurenceTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"sadbutsad, sad, 0", "leetcode, leeto, -1"})
    public void test(String haystack, String needle, int expected) {
        solution = new FirstIndexOfFirstOccurence();
        boolean result = solution.test(() -> {
            System.out.println("Haystack: " + haystack);
            System.out.println("Needle: " + needle);
            System.out.println("Expected: " + expected);
            int actual = ((FirstIndexOfFirstOccurence)solution).strStr(haystack, needle);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }
}
