package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/
*/

public class NumSpecial implements Solution {

    public int numSpecial(int[][] mat) {
        int[] rowMap = new int[mat.length];
        int[] columnMap = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    rowMap[i]++;
                    columnMap[j]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && rowMap[i] == 1 && columnMap[j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }
    
}
