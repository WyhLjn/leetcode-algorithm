package com.wyh.me.leetcode.easy;

/**
 * Title: ValidatePalindrome.java<br>
 * Description:
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年04月29日 15:39:00
 */
public class ValidatePalindrome {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s == "") {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // is Palindrome:false
        System.out.println("is Palindrome:" + new ValidatePalindrome().isPalindrome(s));
    }
}
