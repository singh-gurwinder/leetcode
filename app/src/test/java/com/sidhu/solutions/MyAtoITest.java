package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyAtoITest {
    
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"42, 42", "' -042', -42", "1337c0d3, 1337", "0-1, 0", "words and 987, 0"})
    public void test(String s, int expected) {
        solution = new MyAtoI();
        boolean result = solution.test(() -> {
            int actual = ((MyAtoI) solution).myAtoi(s);
            System.out.println("Input : '" + s + "'");
            System.out.println("Expected : " + expected);
            System.out.println("Actual : " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }
    
}
