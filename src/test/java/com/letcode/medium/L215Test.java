package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class L215Test {
  L215 r = new L215();

  /*
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5   */
  @Test
  void testCase1() {
    assertThat(r.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2), Is.is(5));
  }

  /*
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
   */
  @Test
  void testCase2() {
    assertThat(r.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4), Is.is(4));
  }

  @Test
  void testCase3() {
    assertThat(r.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2), Is.is(5));
  }

}