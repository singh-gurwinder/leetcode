package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SubmatricesCountTest {
    private Solution solution;

    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[][] grid, int k, int expected) {
        solution = new SubmatricesCount();
        boolean result = solution.test(() -> {
            int actual = ((SubmatricesCount) solution).countSubmatrices(grid, k);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[][]{{7, 6, 3}, {6, 6, 1}}, 18, 4),
            Arguments.of(new int[][]{{7, 2, 9}, {1, 5, 0}, {2, 6, 6}}, 20, 6)
        );
    }
}
