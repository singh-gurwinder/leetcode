package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/plus-one/description/
*/

public class PlusOne implements Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] != 9) {
            digits[lastIndex] += 1; 
        } else {
            while (lastIndex > -1 && digits[lastIndex] == 9) {
                digits[lastIndex--] = 0;
            };
            if (lastIndex > -1) {
                digits[lastIndex] += 1;
            } else {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
        }
        return digits;
    }

}
