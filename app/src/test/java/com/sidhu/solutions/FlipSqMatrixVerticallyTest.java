package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FlipSqMatrixVerticallyTest {
    private Solution solution;
    
    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(int[][] nums, int x, int y, int k, int[][] expected) {
        solution = new FlipSqMatrixVertically();
        boolean result = solution.test(() -> {
            System.out.println("Input:");
            for (int[] num : nums) {
                for (int i : num) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            int[][] output = ((FlipSqMatrixVertically) solution).reverseSubmatrix(nums, x, y, k);
            System.out.println("Expected: ");
            for (int[] num : expected) {
                for (int i : num) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println("Output:");
            for (int[] num : output) {
                for (int i : num) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (expected[i][j] != output[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}, 1, 0, 3, new int[][]{{1,2,3,4},{13,14,15,8},{9,10,11,12},{5,6,7,16}}),
            Arguments.of(new int[][]{{3,4,2,3},{2,3,4,2}}, 0, 2, 2, new int[][]{{3,4,4,2},{2,3,2,3}})
        );
    }
}
