package com.wyh.me.leetcode.easy;

/**
 * Title: RemoveDuplicatesFromSortedArray.java<br>
 * Description:
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年02月26日 14:45:00
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0, n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        // 0 1 2 3 4
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
