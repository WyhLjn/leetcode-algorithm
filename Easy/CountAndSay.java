package com.wyh.me.leetcode.easy;

/**
 * Title: CountAndSay.java<br>
 * Description:
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 *
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 *
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年02月27日 15:27:00
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] chars = countAndSay(n - 1).toCharArray();
        int length = chars.length;
        char temp = chars[0];
        int sameCharCount = 0;
        StringBuilder retStr = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char cur = chars[i];
            if (cur == temp) {
                // 统计相同的数字的数量
                sameCharCount ++;
            }
            // 碰到不一样的数字，重置比较的基数字符
            // 保存计算出来的结果，重置基数
            else {
                retStr.append(sameCharCount).append(temp);
                temp = cur;
                sameCharCount = 1;
            }
        }
        retStr.append(sameCharCount > 0 ? sameCharCount + String.valueOf(temp) : "");
        return retStr.toString();
    }

    public static void main(String[] args) {
        // 312211
        System.out.println(new CountAndSay().countAndSay(6));
    }
}
