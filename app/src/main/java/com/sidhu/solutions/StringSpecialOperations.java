package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/process-string-with-special-operations-i/description/
*/

public class StringSpecialOperations implements Solution {

    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '*':
                    if (!sb.isEmpty())
                        sb.deleteCharAt(sb.length() - 1);
                    break;
                case '#':
                    sb.append(sb);
                    break;
                case '%':
                    sb.reverse();
                    break;
                default: sb.append(c);
            }
        }
        return sb.toString();
    }
}
