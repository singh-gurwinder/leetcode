package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/description/
*/

public class SubmatricesCount implements Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
        int row = 0, col = 0;
        int sum = 0;
        while (row < m) {
            while (col < n) {
                if (row == 0) {
                    if (col == 0 && grid[row][col] > k) {
                        return 0;
                    }
                    sum += grid[row][col];
                    if (sum > k) {
                        n = col;
                        break;
                    }
                    result++;
                    col++;
                } else {
                    grid[row][col] += grid[row - 1][col];
                    sum += grid[row][col];
                    if (sum > k) {
                        if (col == 0) {
                            return result;
                        }
                        n = col;
                        break;
                    }
                    result++;
                    col++;
                }
            }
            row++;
            col = 0;
            sum = 0;
        }
        return result;
    }
}
