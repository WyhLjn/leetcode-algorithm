package com.wyh.me.leetcode.easy;

/**
 * Title: TwoSumII.java<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月15日 11:55:00
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                break;
            }
            if (numbers[start] + numbers[end] < target) {
                start ++;
            }
            else {
                end --;
            }
        }
        return new int[]{start + 1, end + 1};
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ret = new TwoSumII().twoSum(numbers, target);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i] + " ");
        }
    }
}
