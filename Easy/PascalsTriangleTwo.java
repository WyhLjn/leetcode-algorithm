package com.wyh.me.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: PascalsTriangleTwo.java<br>
 * Description:
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年04月10日 16:27:00
 */
public class PascalsTriangleTwo {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int k = 1; k <= rowIndex; k++) {
            // 开头结尾的元素需要重写，倒序防止覆盖
            for (int i = k - 1; i >= 1; i--) {
                result.set(i, result.get(i) + result.get(i - 1));
            }
            result.add(1);
        }
        return result;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        // [1,3,3,1]
        System.out.println(new PascalsTriangleTwo().getRow(rowIndex));
    }
}
