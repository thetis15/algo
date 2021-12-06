package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class L152Test {
  L152 r = new L152();

  /*
  Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
   */
  @Test
  void testCase1() {
    assertThat(r.maxProduct(new int[] {2,3,-2,4}), Is.is(6));
  }

  /*
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
   */
  @Test
  void testCase2() {
    assertThat(r.maxProduct(new int[] {-2,0,-1}), Is.is(0));
  }
}