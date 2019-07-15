package com.wyh.me.leetcode.easy;

/**
 * Title: ExcelSheetColumnNumber.java<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月20日 17:29:00
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int ret = 0;
        for (char c : s.toCharArray()) {
            ret = ret * 26 + (c - 'A' + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "AB";
        System.out.println("title to number:" + new ExcelSheetColumnNumber().titleToNumber(s));
    }
}
