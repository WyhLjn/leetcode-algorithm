package com.wyh.me.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: TwoSum.java
 * Description:
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年01月17日 18:20:00
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {
            int ret = target - nums[i];
            if (map.containsKey(ret)) {
                return new int[]{map.get(ret), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 9, 10};
        int target = 12;
        int[] result = twoSum(nums, target);
        // 1:4
        System.out.println(result[0] + ":" + result[1]);
    }
}
