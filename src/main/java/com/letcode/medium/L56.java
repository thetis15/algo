package com.letcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
https://leetcode.com/problems/merge-intervals/

56. Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi],
merge all overlapping intervals, and return an array of the non-overlapping intervals
that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */
public class L56 {
  public int[][] merge(int[][] intervals) {
    List<int[]> result = new ArrayList<>();
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    int min = intervals[0][0], max = intervals[0][1];

    for (int i = 1; i < intervals.length; i++) {
      if ((min <= intervals[i][0] && intervals[i][0] <= max) ||
          (min <= intervals[i][1] && intervals[i][1] <= max)) {
        max = Math.max(max, intervals[i][1]);
        min = Math.min(min, intervals[i][0]);
      } else {
        result.add(new int[] {min, max});
        min = intervals[i][0];
        max = intervals[i][1];
      }
    }
    result.add(new int[] {min, max});

    return result.toArray(new int[result.size()][2]);
  }
}
