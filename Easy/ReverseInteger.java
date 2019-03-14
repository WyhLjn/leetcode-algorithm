package com.wyh.me.leetcode.easy;

/**
 * Title: ReverseInteger.java<br>
 * Description:
 * Given a 32-bit signed integer, reverse digits of an integer.<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年01月18日 14:48:00
 */
public class ReverseInteger {

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            // 提前判断是否溢出
            if (Math.abs(res) > Integer.MAX_VALUE / 10) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int origin = 1534236;
        // reverse:6324351
        System.out.println("reverse:" + new ReverseInteger().reverse(origin));
    }
}
