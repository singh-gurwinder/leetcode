package com.sidhu.solutions;

import java.util.HashSet;
import java.util.Set;

/*
    Solution for https://leetcode.com/problems/find-unique-binary-string/description/
*/

public class UniqueBinaryString implements Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(String num: nums) {
            numsSet.add(Integer.parseInt(num, 2));
        }
        int maxNumber = Integer.parseInt("1".repeat(nums.length), 2) + 1;
        for(int i = 0; i < maxNumber; i++) {
            if(!numsSet.contains(i)) {
                return intToBinaryStringWithLeadingZeros(i, nums.length);
            }
        }
        return null;
    }

    public static String intToBinaryStringWithLeadingZeros(int value, int totalWidth) {
        String binaryString = Integer.toBinaryString(value);
        String formattedString = String.format("%" + totalWidth + "s", binaryString);
        String result = formattedString.replaceAll(" ", "0");
        return result;
    }
}
