package com.wyh.me.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: RomanToInteger.java<br>
 * Description:
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年01月20日 17:16:00
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int pre = 0, ret = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = romanMap.get(s.charAt(i));
            if (cur >= pre) {
                ret += cur;
            }
            else {
                ret -= cur;
            }
            pre = cur;
        }
        return ret;
    }

    public static void main(String[] args) {
        String romanStr = "XIV";
        // roman to int:14
        System.out.println("roman to int:" + new RomanToInteger().romanToInt(romanStr));
    }

}
