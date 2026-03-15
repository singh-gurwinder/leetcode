package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/zigzag-conversion/description/
*/

public class ZigzagConversion implements Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        int i;
        for (i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        i = 0;
        int j = 0;
        for (char c : s.toCharArray()) {
            i += j;
            stringBuilders[i].append(c);
            if (i == 0) {
                j = 1;
            } else if (i == numRows - 1) {
                j = -1;
            }
        }
        for (i = 1; i < numRows; i++) {
            stringBuilders[0].append(stringBuilders[i].toString());
        }
        return stringBuilders[0].toString();
    }

    public String aiConvert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder res = new StringBuilder();
        int n = s.length();
        // The distance between the start of two consecutive vertical columns
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                // Add the vertical character
                res.append(s.charAt(j + i));
                
                // Add the diagonal character (if not the first or last row)
                int diagonalIdx = j + cycleLen - i;
                if (i != 0 && i != numRows - 1 && diagonalIdx < n) {
                    res.append(s.charAt(diagonalIdx));
                }
            }
        }
        return res.toString();
    }
    
}
