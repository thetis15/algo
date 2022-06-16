package com.letcode.easy;

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
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 10^5
 * s[i] is a printable ascii character.
 */
public class L344 {

  public void reverseString(char[] s) {
    System.out.println(s);
    reverseString(s, s.length);
    System.out.println(s);
  }

  private void reverseString(char[] s, int length) {
    if (s.length / 2  >= length) return;
    int sourceIdx = length - 1;
    int targetIdx = s.length - sourceIdx - 1;
    char c = s[sourceIdx];
    s[sourceIdx] = s[targetIdx];
    s[targetIdx] = c;

    reverseString(s, sourceIdx);
  }
}
