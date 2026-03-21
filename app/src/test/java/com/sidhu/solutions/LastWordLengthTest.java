package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LastWordLengthTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"Hello World, 5", "'   fly me   to   the moon  ', 4", "luffy is still joyboy, 6", "' Hi   ', 2"})
    public void test(String input, int expected) {
        solution = new LastWordLength();
        boolean result = solution.test(() -> {
            int actual = ((LastWordLength) solution).lengthOfLastWord(input);
            System.out.println("Input: '" + input + "'");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }
    
}
