package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class L820Test {
  L820 r = new L820();

  /*
Example 1:
Input: words = ["time", "me", "bell"]
Output: 10
Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"
   */
  @Test
  void testCase1() {
    assertThat(r.minimumLengthEncoding(new String[] {"time", "me", "bell"}), Is.is(10));
  }

  /*
Example 2:
Input: words = ["t"]
Output: 2
Explanation: A valid encoding would be s = "t#" and indices = [0].
   */
  @Test
  void testCase2() {
    assertThat(r.minimumLengthEncoding(new String[] {"t"}), Is.is(2));
  }

  @Test
  void testCase3() {
    assertThat(r.minimumLengthEncoding(new String[] {"me","time"}), Is.is(5));
  }
}