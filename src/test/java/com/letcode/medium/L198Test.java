package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class L198Test {
  L198 r = new L198();

  /*
Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
   */
  @Test
  void testCase1() {
    assertThat(r.rob(new int[] {1, 2, 3, 1}), is(4));
  }

  /*
Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
   */
  @Test
  void testCase2() {
    assertThat(r.rob(new int[] {2, 7, 9, 3, 1}), is(12));
  }

  @Test
  void testCase3() {
    assertThat(r.rob(new int[] {1, 1, 0, 0, 100, 100, 100, 0, 0, 100, 100}), is(301));
  }

  @Test
  void testCase4() {
    assertThat(r.rob(new int[] {2, 1, 1, 2, 100, 100, 1, 1, 5}), is(4));
  }
}