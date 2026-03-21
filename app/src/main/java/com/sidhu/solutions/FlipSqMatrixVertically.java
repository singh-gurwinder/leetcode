package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/flip-square-submatrix-vertically/description/
*/

public class FlipSqMatrixVertically implements Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        if (k == 1) {
            return grid;
        }
        int n = x + k - 1;
        int temp;
        while (n > x) {
            for (int i = y; i < k + y; i++) {
                temp = grid[x][i];
                grid[x][i] = grid[n][i];
                grid[n][i] = temp;
            }
            x++;
            n--;
        }
        return grid;
    }
}
