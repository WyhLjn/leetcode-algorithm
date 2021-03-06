package com.wyh.me.leetcode.easy;

/**
 * Title: AddBinary.java<br>
 * Description:
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年02月28日 16:33:00
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        if (null == a || null == b || a.trim().length() == 0 || b.trim().length() == 0) {
            return "";
        }
        int len1 = a.length();
        int len2 = b.length();
        int carry = 0;
        String res = "";
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {
            // 因为char转 int 所以减去'0'
            int p = i < len1 ? a.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;

    }

    public static void main(String[] args) {
        String a = "1110";
        String b = "1110";
        // a + b = 11100
        System.out.println("a + b = " + new AddBinary().addBinary(a, b));
    }
}
