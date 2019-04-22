package com.wyh.me.leetcode.easy;

/**
 * Title: LengthOfLastWord.java<br>
 * Description:
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年02月28日 15:14:00
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (null == s || s.trim().length() == 0) {
            return 0;
        }
        String[] chars = s.split(" ");
        String lastStr = chars[chars.length - 1];
        return lastStr.length();
    }

    public static void main(String[] args) {
        String s = "hello world";
        // lengthOfLastWord:5
        System.out.println("lengthOfLastWord:" + new LengthOfLastWord().lengthOfLastWord(s));
    }
}
