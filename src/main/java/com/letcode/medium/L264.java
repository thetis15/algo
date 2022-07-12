package com.letcode.medium;

/**
 * https://leetcode.com/problems/ugly-number-ii/
 * <p>
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * <p>
 * Given an integer n, return the nth ugly number.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 10
 * Output: 12
 * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: 1
 * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1690
 */

// FIXME: 2022/07/11 못풀었음.
public class L264 {
  public int nthUglyNumber(int n) {
    return ans(n);
  }

  private int ans(int n) {
    int[] ugly = new int[n];
    ugly[0] = 1;
    int index2 = 1, index3 = 1, index5 = 1;
    int factor2 = 2, factor3 = 3, factor5 = 5;
    for (int i = 1; i < n; i++) {
      int min = Math.min(Math.min(factor2, factor3), factor5);
      ugly[i] = min;
      if (factor2 == min) {
        factor2 = 2 * ugly[index2++];
      }
      if (factor3 == min) {
        factor3 = 3 * ugly[index3++];
      }
      if (factor5 == min) {
        factor5 = 5 * ugly[index5++];
      }
    }
    return ugly[n - 1];
  }
}
