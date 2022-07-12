package com.letcode.medium;

import com.sun.source.tree.IfTree;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
https://leetcode.com/problems/string-to-integer-atoi/

8. String to Integer (atoi)
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer
(similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -2^31 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 2^31 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.


Example 1:
Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-2^31, 2^31 - 1], the final result is 42.


Example 2:
Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-2^31, 2^31 - 1], the final result is -42.


Example 3:
Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-2^31, 2^31 - 1], the final result is 4193.


Example 4:
Input: s = "words and 987"
Output: 0
Explanation:
Step 1: "words and 987" (no characters read because there is no leading whitespace)
         ^
Step 2: "words and 987" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "words and 987" (reading stops immediately because there is a non-digit 'w')
         ^
The parsed integer is 0 because no digits were read.
Since 0 is in the range [-2^31, 2^31 - 1], the final result is 0.


Example 5:
Input: s = "-91283472332"
Output: -2147483648
Explanation:
Step 1: "-91283472332" (no characters read because there is no leading whitespace)
         ^
Step 2: "-91283472332" ('-' is read, so the result should be negative)
          ^
Step 3: "-91283472332" ("91283472332" is read in)
                     ^
The parsed integer is -91283472332.
Since -91283472332 is less than the lower bound of the range [-2^31, 2^31 - 1], the final result is clamped to -2^31 = -2147483648.


Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class L8 {
  public int myAtoi(String s) {
    return myAtoiMine(s);
  }

  public int myAtoiMine(String s) {
    long result = 0;
    boolean isNegative = false;
    boolean isNumStart = false;
    List<Character> nums = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
    for (char c : s.toCharArray()) {
      if (nums.contains(c)) {
        isNumStart = true;
        result = result * 10 + Integer.parseInt(String.valueOf(c));

        if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
          break;
        }
      } else {
        if (isNumStart) {
          break;
        } else {
          if (c == '-')  {
            isNumStart = true;
            isNegative = true;
          } else if (c == '+') {
            isNumStart = true;
            isNegative = false;
          } else if (c == ' ') {
            continue;
          } else {
            break;
          }
        }
      }

    }

    if (isNegative) {
      result *= -1;
    }

    if (result >= Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    } else if (result <= Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    } else {
      return (int) result;
    }
  }


























  public int myAtoiAns(String s) {
    if (s == null || s.length() == 0 || s.trim().length() == 0) return 0;

    List<Character> integers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

    s = s.trim();

    StringBuilder sb = new StringBuilder();
    boolean isFirstChar = true;
    boolean skipFirstZero = true;
    for (char c : s.toCharArray()) {
      if (isFirstChar) {
        if ( c == '-' || c == '+') {
          sb.append(c);
          isFirstChar = false;
          continue;
        } else if (integers.contains(c)) {
          sb.append(c);
          skipFirstZero = false;
          isFirstChar = false;
          continue;
        } else {
          break;
        }
      }
      if (integers.contains(c)) {
        if (skipFirstZero && c == '0') {
          continue;
        } else {
          skipFirstZero = false;
        }
        sb.append(c);
      } else {
        break;
      }
    }


    String resultString = sb.toString();
    try {
      long result = Long.parseLong(resultString);
      if (result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }

      return (int) result;

    } catch (NumberFormatException e) {
      if (resultString.length() <= 1) return 0;
      if (resultString.charAt(0) == '-') return Integer.MIN_VALUE;
      return Integer.MAX_VALUE;
    }
  }

}
