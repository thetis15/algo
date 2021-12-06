package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1574Test {
  L1574 r = new L1574();

  /*
Example 1:
Input: arr = [1,2,3,10,4,2,3,5]
Output: 3
Explanation: The shortest subarray we can remove is [10,4,2] of length 3. The remaining elements after that will be [1,2,3,3,5] which are sorted.
Another correct solution is to remove the subarray [3,10,4].
   */
  @Test
  void testCase1() {
    assertEquals(3, r.findLengthOfShortestSubarray(new int[] {1, 2, 3, 10, 4, 2, 3, 5}));
  }

  /*
Example 2:
Input: arr = [5,4,3,2,1]
Output: 4
Explanation: Since the array is strictly decreasing, we can only keep a single element. Therefore we need to remove a subarray of length 4, either [5,4,3,2] or [4,3,2,1].
   */
  @Test
  void testCase2() {
    assertEquals(4, r.findLengthOfShortestSubarray(new int[] {5, 4, 3, 2, 1}));
  }

  /*
Example 3:
Input: arr = [1,2,3]
Output: 0
Explanation: The array is already non-decreasing. We do not need to remove any elements.

   */
  @Test
  void testCase3() {
    assertEquals(0, r.findLengthOfShortestSubarray(new int[] {1, 2, 3}));
  }

  /*
Example 4:
Input: arr = [1]
Output: 0
   */
  @Test
  void testCase4() {
    assertEquals(0, r.findLengthOfShortestSubarray(new int[] {1,2,3,3,3}));
  }

}