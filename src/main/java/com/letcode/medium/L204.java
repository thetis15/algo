package com.letcode.medium;

/**
 * https://leetcode.com/problems/count-primes/
 * <p>
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * <p>
 * Example 1:
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * <p>
 * Example 2:
 * Input: n = 0
 * Output: 0
 * <p>
 * Example 3:
 * Input: n = 1
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 5 * 10^6
 */
public class L204 {
  public int countPrimes(int n) {
    return mine(n);
  }

  private int mine(int n) {
    if (n < 2) {
      return 0;
    }
    int result = 0;

    boolean[] visited = new boolean[n + 1];

    for (int i = 2; i < n; i++) {
      if (visited[i]) continue;

      for (int j = i; j <= n; j += i) {
        visited[j] = true;
      }

      result++;
    }

    return result;
  }

  private boolean isPrime(int i) {
    return false;
  }
















  private int ans(int n) {
    if (n < 1) {
      return 0;
    }

    int result = 0;
    boolean[] visited = new boolean[n + 1];

    for (int i = 2; i < n; i++) {
      if (visited[i]) continue;

      for (int j = i; j <= n; j = j + i) visited[j] = true;

      result += 1;

    }
    return result;
  }
}
