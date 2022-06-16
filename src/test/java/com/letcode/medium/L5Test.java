package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class L5Test {
  L5 l5 = new L5();
  /*
  Example 1:
  Input: s = "babad"
  Output: "bab"
  Note: "aba" is also a valid answer.
   */
  @Test
  void testCase1() {
    String result = l5.longestPalindrome("babad");
    assertTrue(result.equals("bab") || result.equals("aba")
    );
  }
    /*
  Example 2:
  Input: s = "cbbd"
  Output: "bb"
   */
  @Test
  void testCase2() {
    assertEquals("bb", l5.longestPalindrome("cbbd"));
  }
/*
  Example 3:
  Input: s = "a"
  Output: "a"
*/
  @Test
  void testCase3() {
  }

    /*
  Example 4:
  Input: s = "ac"
  Output: "a"

   */
  @Test
  void testCase4() {
  }
}