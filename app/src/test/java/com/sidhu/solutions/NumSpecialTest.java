package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NumSpecialTest {
    private Solution solution;

    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[][] mat, int expected) {
        solution = new NumSpecial();
        boolean result = solution.test(() -> {
            int actual = ((NumSpecial) solution).numSpecial(mat);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}, 1),
            Arguments.of(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, 3)
        );
    }

}
