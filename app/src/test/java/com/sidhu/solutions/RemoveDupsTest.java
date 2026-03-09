package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDupsTest {
    private Solution solution;

    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[] nums, int expected) {
        solution = new RemoveDups();
        boolean result = solution.test(() -> {
            System.out.print("\nBefore: ");
            for (int n : nums) {
                System.out.print(n + " ");
            }
            int actual = ((RemoveDups) solution).removeDuplicates(nums);
            System.out.print("\nAfter: ");
            for (int n : nums) {
                System.out.print(n + " ");
            }
            System.out.print("\nExpected: " + expected);
            System.out.print("\nActual: " + actual);
            return expected ==  actual;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[]{1, 1, 2}, 2),
            Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5)
        );
    }

}
