package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L6Test {
  L6 l6 = new L6();
  /*
  Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
   */
  @Test
  void testCase1() {
    assertEquals("PAHNAPLSIIGYIR", l6.convert("PAYPALISHIRING", 3));
  }
    /*
Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
   */
  @Test
  void testCase2() {
    assertEquals("PINALSIGYAHRPI", l6.convert("PAYPALISHIRING", 4));
  }
    /*
Example 3:
Input: s = "A", numRows = 1
Output: "A"
   */
  @Test
  void testCase3() {
    assertEquals("A", l6.convert("A", 1));
  }

    /*
Example 3:
Input: s = "ABC", numRows = 1
Output: "ABC"
   */
  @Test
  void testCase4() {
    assertEquals("A", l6.convert("A", 1));
  }
}