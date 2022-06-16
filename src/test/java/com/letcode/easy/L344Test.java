package com.letcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L344Test {
  L344 l = new L344();

  /**
   *
   * https://leetcode.com/problems/reverse-string/
   *
   * Write a function that reverses a string. The input string is given as an array of characters s.
   *
   * You must do this by modifying the input array in-place with O(1) extra memory.
   *
   * Example 1:
   * Input: s = ["h","e","l","l","o"]
   * Output: ["o","l","l","e","h"]
   *
   * Constraints:
   *
   * 1 <= s.length <= 10^5
   * s[i] is a printable ascii character.
   */
  @Test
  void test1() {
    l.reverseString(new char[] {'h', 'e', 'l', 'l', 'o'});
  }

  /**
   *
   * https://leetcode.com/problems/reverse-string/
   *
   * Write a function that reverses a string. The input string is given as an array of characters s.
   *
   * You must do this by modifying the input array in-place with O(1) extra memory.
   *
   * Example 2:
   * Input: s = ["H","a","n","n","a","h"]
   * Output: ["h","a","n","n","a","H"]
   *
   * Constraints:
   *
   * 1 <= s.length <= 10^5
   * s[i] is a printable ascii character.
   */
  @Test
  void test2() {
    l.reverseString(new char[] {'H','a','n','n','a','h'});
  }

  @Test
  void test3() {
    l.reverseString("A man, a plan, a canal: Panama".toCharArray());
  }

}