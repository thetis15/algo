package com.letcode.medium;

/*
https://leetcode.com/problems/reverse-integer/

7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0


Constraints:

-2^31 <= x <= 2^31 - 1
 */
public class L7 {
  public int reverse(int x) {
    return reverseMine(x);
  }
  public int reverseMine(int x) {
    int result = 0;
    while (x != 0) {
      long tmp = (long) result * 10;
      if (tmp != result * 10) {
        return 0;
      }
      result *= 10;
      result += x % 10;
      x /= 10;
    }
    return result;
  }
  public int reverseAns(int x) {
    int result = 0;
    while (x != 0) {
      long i = (long) result * 10;
      if (i != result * 10) {
        return 0;
      } else {
        result = (int) i + x % 10;
      }

      x /= 10;
    }
    return result;
  }
}
