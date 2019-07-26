package com.wyh.me.leetcode.easy;

/**
 * Title: CountPrimes.java<br>
 * Description:
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月24日 17:46:00
 */
public class CountPrimes {

    /**
     * 统计小于目标数的质数的个数
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    notPrime[j * i] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20;
        // count primes:8
        System.out.println("count primes:" + new CountPrimes().countPrimes(n));
    }
}
