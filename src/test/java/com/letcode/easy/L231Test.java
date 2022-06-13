package com.letcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L231Test {
  L231 l = new L231();

  /**
   *
   * Given an integer n, return true if it is a power of two. Otherwise, return false.
   *
   * An integer n is a power of two, if there exists an integer x such that n == 2^x.
   *
   * Example 1:
   * Input: n = 1
   * Output: true
   * Explanation: 20 = 1
   *
   * Constraints:
   *
   * -2^31 <= n <= 2^31 - 1
   *
   */
  @Test
  void test1() {
    assertTrue(l.isPowerOfTwo(1));
  }

  /**
   *
   * Given an integer n, return true if it is a power of two. Otherwise, return false.
   *
   * An integer n is a power of two, if there exists an integer x such that n == 2^x.
   *
   * Example 2:
   * Input: n = 16
   * Output: true
   * Explanation: 24 = 16
   *
   * Constraints:
   *
   * -2^31 <= n <= 2^31 - 1
   *
   */
  @Test
  void test2() {
    assertTrue(l.isPowerOfTwo(16));
  }

  /**
   *
   * Given an integer n, return true if it is a power of two. Otherwise, return false.
   *
   * An integer n is a power of two, if there exists an integer x such that n == 2^x.
   * Example 3:
   * Input: n = 3
   * Output: false
   *
   * Constraints:
   *
   * -2^31 <= n <= 2^31 - 1
   *
   */
  @Test
  void test3() {
    assertFalse(l.isPowerOfTwo(3));
  }
}