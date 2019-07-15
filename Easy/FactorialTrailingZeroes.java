package com.wyh.me.leetcode.easy;

/**
 * Title: FactorialTrailingZeroes.java<br>
 * Description:
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 *
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月20日 18:07:00
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int ret = 0;
        // 分解质因子可知，求5的个数即可
        while (n > 0) {
            ret += n / 5;
            n /= 5;
        }
        return ret;
    }

    private long factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("factorial:" + new FactorialTrailingZeroes().factorial(n));
        System.out.println("trailing zeroes:" + new FactorialTrailingZeroes().trailingZeroes(n));
    }
}
