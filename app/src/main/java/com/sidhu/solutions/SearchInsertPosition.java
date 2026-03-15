package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/search-insert-position/description/
*/

public class SearchInsertPosition implements Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid;
        while (end - start > 1) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] >= target) {
            return start;
        } else if (nums[end - 1] >= target) {
            return end -  1;
        }
        return end;
    }

    public int aiSearchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            
            if (nums[mid] == target) return mid;
            
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return start;
    }

}
