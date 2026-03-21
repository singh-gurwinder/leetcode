package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PlusOneTest {
    private Solution solution;
    
    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[] nums, int[] expected) {
        solution = new PlusOne();
        boolean result = solution.test(() -> {
            System.out.print("\nInput: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            int[] output = ((PlusOne) solution).plusOne(nums);
            System.out.print("\nExpected: ");
            for (int num : expected) {
                System.out.print(num + " ");
            }
            System.out.print("\nOutput: ");
            for (int num : output) {
                System.out.print(num + " ");
            }
            for (int i = 0; i < output.length; i++) {
                if (output[i] != expected[i]) {
                    return false;
                }
            }
            return output.length == expected.length;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
            Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2}),
            Arguments.of(new int[]{9}, new int[]{1, 0}),
            Arguments.of(new int[]{1, 9}, new int[]{2, 0}),
            Arguments.of(new int[]{1, 2, 9, 9}, new int[]{1, 3, 0, 0}),
            Arguments.of(new int[]{9, 9, 9, 9}, new int[]{1, 0, 0, 0, 0})
        );
    }
    
}
