package com.wyh.me.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: PascalsTriangle.java<br>
 * Description:
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年04月09日 17:30:00
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        for (int j = 0; j < numRows; j++) {
            List<Integer> rows = new ArrayList<>();
            rows.add(1);
            for (int i = 1; i < j; i++) {
                List<Integer> preRow = result.get(j - 1);
                int temp = preRow.get(i - 1) + preRow.get(i);
                rows.add(temp);
            }
            if (j != 0){
                rows.add(1);
            }
            result.add(rows);
        }
        return result;
    }

    public static void main(String[] args) {
        // Pascal's Triangle:[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
        System.out.println("Pascal's Triangle:" + new PascalsTriangle().generate(5));
    }

}
