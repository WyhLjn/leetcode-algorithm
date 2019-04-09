package com.wyh.me.leetcode.easy;

/**
 * Title: ImplementStrStr.java<br>
 * Description:
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <br>
 *
 * Copyright: Copyright (c) 2019<br>
 * Company：北京云杉世界信息技术有限公司<br>
 *
 * @author wyh
 * @date 2019年02月26日 20:01:00
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (null == haystack) return 0;
        if (null == needle || needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i < m - n + 1; i++) {
            int j = 0;
            for (; j < n; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) break;
            }
            if (j == n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "bcdefgabcdabc";
        int index = new ImplementStrStr().strStr(str, "abc");
        // index:6
        System.out.println("index:" + index);
    }
}
