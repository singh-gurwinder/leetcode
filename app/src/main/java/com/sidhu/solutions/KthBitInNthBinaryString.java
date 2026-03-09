package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
*/

public class KthBitInNthBinaryString implements Solution {
    StringBuilder sb = new StringBuilder();
    String s;

    public char findKthBit(int n, int k) {
        return convertToBinary(n).charAt(k - 1);
    }

    private String convertToBinary(int n) {
        if (n == 1) {
            return "0";
        }
        s = convertToBinary(n - 1);
        return s + "1" + invertAndReverse(s);
    }

    private String invertAndReverse(String s) {
        sb.setLength(0);
        for (char c : s.toCharArray()) {
            sb.append(c == '0' ? '1' : '0');
        }
        return sb.reverse().toString();
    }
    
}
