package com.wyh.me.leetcode.easy;

/**
 * Title: RotateArray.java<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月20日 19:17:00
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = -1;
        new RotateArray().rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
