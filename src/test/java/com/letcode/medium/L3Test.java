package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class L3Test {
  L3 l3 = new L3();
  /*
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
   */
  @Test
  void testCase1() {
    assertEquals(3, l3.lengthOfLongestSubstring("abcabcbb"));
  }
    /*
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
   */
  @Test
  void testCase2() {
    assertEquals(1, l3.lengthOfLongestSubstring("bbbbb"));
  }

    /*
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
   */
  @Test
  void testCase3() {
    assertEquals(3, l3.lengthOfLongestSubstring("pwwkew"));
  }

    /*
Example 4:
Input: s = ""
Output: 0
   */
  @Test
  void testCase4() {
    assertEquals(0, l3.lengthOfLongestSubstring(""));
  }

    /*
Input: s = "au"
Output: 2
   */
  @Test
  void testCase5() {
    assertEquals(2, l3.lengthOfLongestSubstring("au"));
  }

    /*
Input: s = "dvdf"
Output: 2
   */
  @Test
  void testCase6() {
    assertEquals(3, l3.lengthOfLongestSubstring("dvdf"));
  }
}