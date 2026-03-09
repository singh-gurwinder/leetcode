package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UniqueBinaryStringTest {
    private Solution solution;
    
    @ParameterizedTest
    @MethodSource("testArguments")
    public void test(String[] nums, String[] expected) {
        solution = new UniqueBinaryString();
        boolean result = solution.test(() -> {
            System.out.print("\nInput: ");
            for (String num : nums) {
                System.out.print(num + " ");
            }
            String output = ((UniqueBinaryString) solution).findDifferentBinaryString(nums);
            System.out.print("\nExpected: ");
            for (String num : expected) {
                System.out.print(num + " ");
            }
            System.out.println("\nOutput: " + output);
            for (String num : expected) {
                if (output.equals(num)) {
                    return true;
                }
            }
            return false;
        });
        assertTrue(result);
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
            Arguments.of(new String[]{"01", "10"}, new String[]{"00", "11"}),
            Arguments.of(new String[]{"00", "01"}, new String[] {"10", "11"}),
            Arguments.of(new String[]{"111", "011", "001"}, new String[]{"000", "010", "100", "101", "110"})
        );
    }

}
