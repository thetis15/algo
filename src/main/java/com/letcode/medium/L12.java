package com.letcode.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/*
https://leetcode.com/problems/integer-to-roman/
12. Integer to Roman

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.



Example 1:
Input: num = 3
Output: "III"

Example 2:
Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"

Example 4:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Example 5:
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= num <= 3999

 */
public class L12 {
  public String intToRoman(int num) {
    return intToRomanMine(num);
  }

  /*
  Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

   */
  public String intToRomanMine(int num) {
    StringBuilder result = new StringBuilder();
/*
1 = I
2 = II
3 = III
4 = IV
5 = V
6 = VI
7 = VII
8 = VIII
9 = IX
10 = X
11 = XI
12 = XII
13 = XIII
14 = XIV
15 = XV
8    = 5 + 1 + 1 + 1
VIII = V + I + I + I
 */
    // @formatter:off
    String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    int[]      nums = {  1,    4,   5,    9,  10,   40,  50,   90, 100,  400, 500,  900, 1000};
    // @formatter:on

    while (num > 0) {
      for (int i = nums.length - 1; i >= 0; i--) {
        if (num >= nums[i]) {
          num -= nums[i];
          result.append(romans[i]);
          i++;
        }
      }
    }
    return result.toString();
  }


  private String intToRomanAns(int num) {
    StringBuilder sb = new StringBuilder();
    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    while (num > 0) {
      for (int i = 0; i < nums.length; i++) {
        if (num >= nums[i]) {
          sb.append(romans[i]);
          num -= nums[i];
          i--;
        }
      }
    }

    return sb.toString();
  }
}
