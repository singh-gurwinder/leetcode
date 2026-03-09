package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveElementTest {
    private Solution solution;

    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[] nums, int val, int expected) {
        solution = new RemoveElement();
        boolean result = solution.test(() -> {
            System.out.println("Before");
            for (int n : nums) {
                System.out.print(n + " ");
            }
            int actual = ((RemoveElement) solution).removeElement(nums, val);
            System.out.println("\nAfter: " + actual);
            for (int n : nums) {
                System.out.print(n + " ");
            }
            System.out.println("\nExpected: " + expected);
            System.out.println("Actual: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[]{3, 2, 2, 3}, 3, 2),
            Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }

}
