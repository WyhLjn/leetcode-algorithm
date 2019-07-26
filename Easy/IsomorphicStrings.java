package com.wyh.me.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: IsomorphicStrings.java<br>
 * Description:
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 *
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 * Note:
 * You may assume both s and t have the same length.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月24日 18:21:00
 */
public class IsomorphicStrings {

    /**
     * 判断两个字符串是否结构相同
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        Map m = new HashMap();
        for (Integer i = 0; i < s.length(); i++) {
            // put返回old value，插入相同的值会返回之前的值，依据这个规律可以判断
            Object sVal = m.put(s.charAt(i), i);
            Object tVal = m.put(t.charAt(i) + "", i);
            if (sVal != tVal) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(new IsomorphicStrings().isIsomorphic(s, t));
    }
}
