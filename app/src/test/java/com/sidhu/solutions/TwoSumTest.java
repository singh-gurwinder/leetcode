package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TwoSumTest {
    private Solution solution;

    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[] nums, int target, int[] expected) {
        solution = new TwoSum();
        boolean result = solution.test(() -> {
            int[] output = ((TwoSum) solution).twoSum(nums, target);
            System.out.print("\nExpected: ");
            for (int n : expected) {
                System.out.print(n + " ");
            }
            System.out.print("\nActual: ");
            for (int n : output) {
                System.out.print(n + " ");
            }
            return output[0] == expected[0] && output[1] == expected[1];
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
            Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
            Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }
    
}
