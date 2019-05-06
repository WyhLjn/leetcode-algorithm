package com.wyh.me.leetcode.easy;

/**
 * Title: MergeSortedArray.java<br>
 * Description:
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年03月08日 14:39:00
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (null == nums1) {
            return;
        }
        if (null == nums2) {
            return;
        }
        if (nums1.length < (m + n)) {
            return;
        }
        int i = m - 1, j = n - 1, k = m + n -1;
        // 倒序插入（不会覆盖之前的元素，也不用新建数组）
        // 先判断nums1，最后剩余的只会是nums2
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 4, 5, 5, 6};
        int m = 5, n = 5;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        int i = 0;
        while (i != nums1.length) {
            System.out.println(nums1[i++] + " ");
        }
    }
}
