package com.wyh.me.leetcode.easy;

/**
 * Title: SingleNumber.java<br>
 * Description:
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年04月29日 15:58:00
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (null == nums || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2, 4, 3, 2};
        // single number:1
        System.out.println("single number:" + new SingleNumber().singleNumber(nums));
    }
}
