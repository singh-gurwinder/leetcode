package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchInsertPositionTest {
    private Solution solution;

    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[] nums, int target, int expected) {
        solution = new SearchInsertPosition();
        boolean result = solution.test(() -> {
            System.out.print("\nInput: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            int actual = ((SearchInsertPosition) solution).searchInsert(nums, target);
            System.out.print("\nTarget: " + target);
            System.out.print("\nExpected: " + expected);
            System.out.println("\nOutput: " + actual);
            return expected == actual;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
            Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
            Arguments.of(new int[]{1, 3, 5, 6}, 7, 4)
        );
    }

}
