package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/complement-of-base-10-integer/description/
*/
public class Base10IntComplement implements Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            sb.append('1' - c);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

}
