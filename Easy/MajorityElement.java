package com.wyh.me.leetcode.easy;

/**
 * Title: MajorityElement.java<br>
 * Description:
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月15日 17:32:00
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int maxCount = 0, ret = 0;
        for (int num : nums) {
            if (maxCount == 0) {
                ret = num;
            }
            if (num != ret) {
                maxCount--;
            }
            else {
                maxCount++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        // majority element:2
        System.out.println("majority element:" + new MajorityElement().majorityElement(nums));
    }
}
