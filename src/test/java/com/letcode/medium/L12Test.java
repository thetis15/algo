package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class L12Test {
  L12 r = new L12();
  /*
  Example 1:
Input: num = 3
Output: "III"
   */
  @Test
  void testCase1() {
    assertEquals("III", r.intToRoman(3));
  }

  /*
Example 2:
Input: num = 4
Output: "IV"
   */
  @Test
  void testCase2() {
    assertEquals("IV", r.intToRoman(4));
  }

  /*
Example 3:
Input: num = 9
Output: "IX"
   */
  @Test
  void testCase3() {
    assertEquals("IX", r.intToRoman(9));
  }

  /*
Example 4:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
   */
  @Test
  void testCase4() {
    assertEquals("LVIII", r.intToRoman(58));
  }

  /*
Example 5:
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
   */
  @Test
  void testCase5() {
    assertEquals("MCMXCIV", r.intToRoman(1994));
  }

  @Test
  void testCase6() {
    assertEquals("XX", r.intToRoman(20));
  }

}