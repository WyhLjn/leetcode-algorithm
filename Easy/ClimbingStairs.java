package com.wyh.me.leetcode.easy;

/**
 * Title: ClimbingStairs.java<br>
 * Description:
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 *
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年03月07日 18:00:00
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int[] ret = new int[n + 1];
        ret[0] = 0;
        ret[1] = 1;
        ret[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            ret[i] = ret[i - 1] + ret[i - 2];
        }
        return ret[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // 3
        System.out.println(new ClimbingStairs().climbStairs(n));
    }
}
