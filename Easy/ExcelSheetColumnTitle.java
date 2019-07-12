package com.wyh.me.leetcode.easy;

/**
 * Title: ExcelSheetColumnTitle.java<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月15日 12:14:00
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n --;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int n = 701;
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(n));
    }
}
