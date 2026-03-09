package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/
*/

public class MinAltBinaryString implements Solution {
    public int minOperations(String s) {
        int ops = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i % 2 != s.charAt(i) - '0') {
                ops++;
            } 
        }
        return Math.min(ops, n - ops);
    }

}
