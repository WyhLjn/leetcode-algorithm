package com.wyh.me.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: ContainsDuplicateTwo.java<br>
 * Description:
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月27日 18:53:00
 */
public class ContainsDuplicateTwo {

    /**
     * 数组里有两个数相等，并且索引相差等于k
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 1 || k < 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            // 移除超出位置差是K之前的元素
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,6,5,4,1};
        System.out.println(new ContainsDuplicateTwo().containsNearbyDuplicate(nums, 4));
    }
}