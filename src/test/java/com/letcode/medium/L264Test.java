package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class L264Test {
  L264 l = new L264();

  /**
   * Example 1:
   * Input: n = 10
   * Output: 12
   * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
   */
  @Test
  void test1() {
    assertThat(12, is(l.nthUglyNumber(10)));
  }

  /**
   * Example 2:
   * Input: n = 1
   * Output: 1
   * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
   */
  @Test
  void test2() {
    assertThat(1, is(l.nthUglyNumber(1)));
  }
}