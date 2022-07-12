package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L8Test {
  L8 r = new L8();
  /*
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
   */
  @Test
  void testCase1() {
    assertEquals(42, r.myAtoi("42"));
  }
  /*
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
   */
  @Test
  void testCase2() {
    assertEquals(-42, r.myAtoi("   -42"));
  }
  /*
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
   */
  @Test
  void testCase3() {
    assertEquals(4193, r.myAtoi("4193 with words"));
  }
  /*
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
   */
  @Test
  void testCase4() {
    assertEquals(0, r.myAtoi("words and 987"));
  }
  /*
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
   */
  @Test
  void testCase5() {
    assertEquals(-2147483648, r.myAtoi("-91283472332"));
  }

  @Test
  void testCase6() {
    assertEquals(3, r.myAtoi("3.14159"));
  }

  @Test
  void testCase7() {
    assertEquals(-12, r.myAtoi("  -0012a42"));
  }

  @Test
  void testCase8() {
    assertEquals(1, r.myAtoi("+1"));
  }

  @Test
  void testCase9() {
    assertEquals(2147483647, r.myAtoi("20000000000000000000"));
  }

  @Test
  void testCase10() {
    assertEquals(0, r.myAtoi("+-12"));
  }

  @Test
  void testCase11() {
    assertEquals(0, r.myAtoi("00000-42a1234"));
  }

  /*
  Input
"9223372036854775808"
Expected
2147483647
   */
  @Test
  void testCase12() {
    assertEquals(2147483647, r.myAtoi("9223372036854775808"));
  }
}