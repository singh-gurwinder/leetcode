package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/string-to-integer-atoi/description/
*/

public class MyAtoI implements Solution {
    public int myAtoi(String s) {
        char[] chars = s.trim().toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        if (chars[0] != '-' && chars[0] != '+' && !Character.isDigit(chars[0])) {
            return 0;
        }
        boolean negative = chars[0] == '-';
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        int i = chars[0] == '-' || chars[0] == '+' ? 1 : 0;
        for (; i < chars.length; i++) {
            if (leadingZero && chars[i] == '0') {
                continue;
            }
            leadingZero = false;
            if (sb.length() == 0 && !Character.isDigit(chars[i])) {
                return 0;
            } else if (Character.isDigit(chars[i])) {
                sb.append(chars[i]);
            } else {
                break;
            }
        }
        if (sb.length() == 0) {
            return 0;
        } else if (sb.length() > 11) {
            sb.setLength(11);
        }
        Long l = Long.parseLong(negative ? "-" + sb.toString() : sb.toString());
        if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return l.intValue();
    }

    public int aiAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0;
        int n = s.length();
        
        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        // 2. Determine sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        // 3. Convert digits and handle overflow
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';

            // Check for overflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || 
            (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
        }

        return result * sign;
    }
    
}
