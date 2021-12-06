package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class L1985Test {
  L1985 r = new L1985();

  /*
Example 1:
Input: nums = ["3","6","7","10"], k = 4
Output: "3"
Explanation:
The numbers in nums sorted in non-decreasing order are ["3","6","7","10"].
The 4th largest integer in nums is "3".
*/
  @Test
  void testCase1() {
    assertThat(r.kthLargestNumber(new String[] {"3", "6", "7", "10"},4), Is.is("3"));
  }

  /*
Example 2:
Input: nums = ["2","21","12","1"], k = 3
Output: "2"
Explanation:
The numbers in nums sorted in non-decreasing order are ["1","2","12","21"].
The 3rd largest integer in nums is "2".
*/
  @Test
  void testCase2() {
    assertThat(r.kthLargestNumber(new String[] {"2","21","12","1"},3), Is.is("2"));
  }

/*
Example 3:
Input: nums = ["0","0"], k = 2
Output: "0"
*/
  @Test
  void testCase3() {
    assertThat(r.kthLargestNumber(new String[] {"0", "0"},2), Is.is("0"));
  }

}