package com.sidhu;

import com.sidhu.solutions.NoRepeatLongestSubstr;
import com.sidhu.solutions.Solution;

public class App {
    public boolean test() {
        Solution solution = new NoRepeatLongestSubstr();
        return solution.test(() -> {
            String input = "pwabcdefwkew";
            int expected = 8;
            int actual = ((NoRepeatLongestSubstr)solution).lengthOfLongestSubstring(input);
            System.out.println("Input : '" + input + "'");
            System.out.println("Expected : " + expected);
            System.out.println("Actual : " + actual);
            return expected == actual;
        });
    }
    
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Test Passed: " + app.test());
    }
}
