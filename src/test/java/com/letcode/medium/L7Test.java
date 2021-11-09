package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L7Test {
  L7 l7 = new L7();
  /*
Example 1:
Input: x = 123
Output: 321
   */
  @Test
  void testCase1() {
    assertEquals(321, l7.reverse(123));
  }
    /*
Example 2:
Input: x = -123
Output: -321
   */
  @Test
  void testCase2() {
    assertEquals(-321, l7.reverse(-123));
  }
    /*
Example 3:
Input: x = 120
Output: 21
   */
  @Test
  void testCase3() {
    assertEquals(21, l7.reverse(120));
  }
    /*
Example 4:
Input: x = 0
Output: 0
   */
  @Test
  void testCase4() {
    assertEquals(0, l7.reverse(0));
  }

    /*
Example 5:
Input: x = 1534236469
Output: 0
   */
  @Test
  void testCase6() {
    assertEquals(0, l7.reverse(1534236469));
  }

}