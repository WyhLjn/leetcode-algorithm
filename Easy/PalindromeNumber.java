package com.wyh.me.leetcode.easy;

/**
 * Title: PalindromeNumber.java<br>
 * Description:
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年01月20日 16:24:00
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // 负数，小数都不是回文
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertNumber = 0;
        // 找到数字的中间位置
        while (x > revertNumber) {
            revertNumber = revertNumber * 10 + x % 10;
            x /= 10;
        }
        return  x == revertNumber || x == revertNumber / 10;
    }

    public static void main(String[] args) {
        int originNumber = 123321;
        // 123321 isPalindrome:true
        System.out.println(originNumber + " isPalindrome:" + new PalindromeNumber().isPalindrome(originNumber));
    }
}
