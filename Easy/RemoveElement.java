package com.wyh.me.leetcode.easy;

/**
 * Title: RemoveElement.java<br>
 * Description:
 *
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.<br>
 *
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年02月26日 15:46:00
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 4, 5, 2};
        int n = new RemoveElement().removeElement(nums, 2);
        // 1 0 4 5
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] + "");
        }
    }
}
