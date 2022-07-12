package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class L204Test {
  L204 l = new L204();

  /**
   * Example 1:
   * Input: n = 10
   * Output: 4
   * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
   *
   * Constraints:
   *
   * 0 <= n <= 5 * 10^6
   */
  @Test
  void test1() {
    assertEquals(4, l.countPrimes(10));
  }

  /**
   * Example 2:
   * Input: n = 0
   * Output: 0
   *
   * Constraints:
   *
   * 0 <= n <= 5 * 10^6
   */
  @Test
  void test2() {
    assertEquals(0, l.countPrimes(0));
  }

  /**
   * Example 3:
   * Input: n = 1
   * Output: 0
   *
   * Constraints:
   *
   * 0 <= n <= 5 * 10^6
   */
  @Test
  void test3() {
    assertEquals(0, l.countPrimes(1));
  }

  // Wrong Answer
  @Test
  void test4() {
    assertEquals(0, l.countPrimes(2));
  }

  // Time Limit Exceeded
  @Test
  @Timeout(3)
  void test5() {
    assertEquals(41537, l.countPrimes(499979));
  }

  // Time Limit Exceeded
  @Test
  @Timeout(3)
  void test6() {
    assertEquals(114155, l.countPrimes(1500000));
  }

  // Time Limit Exceeded
  @Test
  @Timeout(10)
  void test7() {
    int n = 5 * (int) Math.pow(10, 6);
    assertEquals(348513, l.countPrimes(n));
  }
}