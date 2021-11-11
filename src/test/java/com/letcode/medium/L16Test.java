package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class L16Test {
  L16 r = new L16();

  /*
  Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

   */
  @Test
  void testCase1() {
    assertEquals(2, r.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
  }

  /*
Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
   */
  @Test
  void testCase2() {
    assertEquals(0, r.threeSumClosest(new int[] {0, 0, 0}, 1));
  }

  @Test
  void testCase3() {
    assertEquals(3, r.threeSumClosest(new int[] {1, 1, 1, 1}, 0));
  }

  @Test
  void testCase4() {
    assertEquals(2, r.threeSumClosest(new int[] {1, 1, 1, 0}, -100));
  }

  @Test
  void testCase5() {
    assertEquals(0, r.threeSumClosest(new int[] {0, 2, 1, -3}, 1));
  }

  @Test
  void testCase6() {
    assertEquals(82, r.threeSumClosest(new int[] {1, 2, 4, 8, 16, 32, 64, 128}, 82));
  }
}