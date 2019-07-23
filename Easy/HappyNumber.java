package com.wyh.me.leetcode.easy;

import java.util.HashSet;

/**
 * Title: HappyNumber.java<br>
 * Description:
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 *
 * Explanation:
 *
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月22日 16:00:00
 */
public class HappyNumber {

    /**
     * 将数字的每个位一直求平方和，如果最后等于1，说明是happy number
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (!hashSet.contains(n)) {
            hashSet.add(n);
            int temp = 0;
            while (n > 0) {
                temp += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = temp;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println("happy number result : " + new HappyNumber().isHappy(n));
    }
}
