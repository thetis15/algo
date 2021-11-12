package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class L18Test {
  L18 r = new L18();

  /*
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
   */
  @Test
  void testCase1() {
    assertEquals(
        Arrays.asList(
            Arrays.asList(-2, -1, 1, 2),
            Arrays.asList(-2, 0, 0, 2),
            Arrays.asList(-1, 0, 0, 1)
        ),
        r.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
  }

  /*
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
   */
  @Test
  void testCase2() {
    assertEquals(
        Arrays.asList(
            Arrays.asList(2, 2, 2, 2)
        ),
        r.fourSum(new int[] {2, 2, 2, 2}, 8));
  }

  @Test
  void testCase3() {
    assertEquals(
        Arrays.asList(
            Arrays.asList(-4, 0, 1, 2),
            Arrays.asList(-1, -1, 0, 1)
        ),
        r.fourSum(new int[] {-1, 0, 1, 2, -1, -4}, -1));
  }

  @Test
  void testCase4() {
    assertEquals(
        Arrays.asList(
            Arrays.asList(-3, -1, 2, 4)
        ),
        r.fourSum(new int[] {-3,-1,0,2,4,5}, 2));
  }
}