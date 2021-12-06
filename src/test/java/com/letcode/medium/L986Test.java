package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L986Test {
  L986 r = new L986();

  /*

Example 1: https://assets.leetcode.com/uploads/2019/01/30/interval1.png
Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
   */
  @Test
  void testCase1() {
    assertThat(new int[][] {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}},
        is(r.intervalIntersection(new int[][] {{0, 2}, {5, 10}, {13, 23}, {24, 25}},
            new int[][] {{1, 5}, {8, 12}, {15, 24}, {25, 26}})));

  }

  /*

Example 2:
Input: firstList = {{1,3},{5,9}}, secondList = {}
Output: {}
   */
  @Test
  void testCase2() {
    assertThat(new int[0][0],
        is(r.intervalIntersection(new int[][] {{1, 3}, {5, 9}}, new int[][] {})));
  }

  /*
Example 3:
Input: firstList = {}, secondList = {{4,8},{10,12}}
Output: {}
   */
  @Test
  void testCase3() {
    assertThat(new int[0][0],
        is(r.intervalIntersection(new int[][] {}, new int[][] {{4, 8}, {10, 12}})));
  }

  /*
Example 4:
Input: firstList = {{1,7}}, secondList = {{3,10}}
Output: {{3,7}}
   */
  @Test
  void testCase4() {
    assertThat(new int[][] {{3, 7}},
        is(r.intervalIntersection(new int[][] {{1, 7}}, new int[][] {{3, 10}})));
  }
}