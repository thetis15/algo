package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L56Test {
  L56 r = new L56();

  /*
  Example 1:
Input: intervals = {{1,3},{2,6},{8,10},{15,18}}
Output: {{1,6},{8,10},{15,18}}
Explanation: Since intervals {1,3} and {2,6} overlaps, merge them into {1,6}.
   */
  @Test
  void testCase1() {
    assertThat(r.merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}),
        is(new int[][] {{1, 6}, {8, 10}, {15, 18}}));
  }

  /*
Example 2:
Input: intervals = {{1,4},{4,5}}
Output: {{1,5}}
Explanation: Intervals {1,4} and {4,5} are considered overlapping.
   */
  @Test
  void testCase2() {
    assertThat(r.merge(new int[][] {{1, 4}, {4, 5}}),
        is(new int[][] {{1, 5}}));
  }

  @Test
  void testCase3() {
    assertThat(r.merge(new int[][] {{1, 4}, {0, 4}}),
        is(new int[][] {{0, 4}}));
  }

  @Test
  void testCase4() {
    assertThat(r.merge(new int[][] {{1, 4}, {0, 1}}),
        is(new int[][] {{0, 4}}));
  }

  /*
Input
{{1,3},{2,6},{8,10},{15,18}}
Output
{{2,6},{8,10},{15,18}}
Expected
{{1,6},{8,10},{15,18}}
   */
  @Test
  void testCase5() {
    assertThat(r.merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}),
        is(new int[][] {{1, 6}, {8, 10}, {15, 18}}));
  }

  @Test
  void testCase6() {
    assertThat(r.merge(new int[][] {{1, 4}, {0, 5}}),
        is(new int[][] {{0, 5}}));
  }
}