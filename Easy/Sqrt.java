package com.wyh.me.leetcode.easy;

/**
 * Title: Sqrt.java<br>
 * Description:
 *
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * Example 1:
 *
 * Input: 4
 * Output: 2
 *
 * Example 2:
 *
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 *              the decimal part is truncated, 2 is returned.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年03月05日 14:33:00
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 1, right = x / 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (x / mid == mid) {
                return mid;
            }
            if (x / mid > mid) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        // sqrt(15) = 3
        System.out.println("sqrt(15) = " + new Sqrt().mySqrt(15));
    }
}
