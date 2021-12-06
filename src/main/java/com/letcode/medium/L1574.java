package com.letcode.medium;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/
1574. Shortest Subarray to be Removed to Make Array Sorted

Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing.

A subarray is a contiguous subsequence of the array.

Return the length of the shortest subarray to remove.


Example 1:
Input: arr = [1,2,3,10,4,2,3,5]
Output: 3
Explanation: The shortest subarray we can remove is [10,4,2] of length 3. The remaining elements after that will be [1,2,3,3,5] which are sorted.
Another correct solution is to remove the subarray [3,10,4].

Example 2:
Input: arr = [5,4,3,2,1]
Output: 4
Explanation: Since the array is strictly decreasing, we can only keep a single element. Therefore we need to remove a subarray of length 4, either [5,4,3,2] or [4,3,2,1].

Example 3:
Input: arr = [1,2,3]
Output: 0
Explanation: The array is already non-decreasing. We do not need to remove any elements.

Example 4:
Input: arr = [1]
Output: 0

Constraints:
1 <= arr.length <= 10^5
0 <= arr[i] <= 10^9
 */
public class L1574 {

  public int findLengthOfShortestSubarray(int[] arr) {
    if (arr.length <= 1) {
      return arr.length;
    }

    int left = 0;
    int right = arr.length - 1;

    while (left < right && (arr[left] < arr[left + 1])) {
      left++;
    }

    if (left == right) {
      return 0;
    }

    int result = right;

    //  [1,2,3,10,4,2,3,5]
    //  [0,1,2, 3,4,5,6,7]
    //  2 - 5 - 1

    System.out.println("Started!");
    System.out.println(ToStringBuilder.reflectionToString(arr));
    while (left < right) {
      System.out.println(String.format(">> left: %s[%s] right: %s[%s]", left, arr[left], right, arr[right]));
      while(left > 0 && arr[left] > arr[right]) {
        left--;
        System.out.println(String.format(">>> left: %s[%s]", left, arr[left]));
      }

      if (arr[right - 1] <= arr[right]) {
        System.out.println(String.format(">>>> right: %s[%s]", right, arr[right]));
        result = Math.min(result, right - left - 1);
      } else {
        System.out.println("breaked!");
        break;
      }

      right--;
    }


    return result;
  }





  // 정답임
  public int findLengthOfShortestSubarrayAnswer(int[] arr) {
    int left = 0, right = arr.length - 1;

    while (right > 0 && arr[right - 1] <= arr[right]) {
      right--;
    }

    //whole array sorted
    if (right == 0) {
      return 0;
    }

    //arr[right...arr.length - 1] is sorted, set the result by removing the arr[0...right -1]
    int result = right;

    while (left < right) {
      //Move the window such that arr[left] <= arr[right]
      while (right < arr.length && arr[left] > arr[right]) {
        right++;
      }

      //Remove the subarray between left and right index and update the minimum
      result = Math.min(result, right - left - 1);

      //The subarray arr[0...left] is sorted, then remove the right side completely and update result if minimum
      if (arr[left] <= arr[left + 1]) {
        result = Math.min(result, arr.length - (left + 2));
      } else {
        break;
      }

      left++;
    }

    return result;
  }

  public int findLengthOfShortestSubarrayThetis15(int[] arr) {
    if (arr.length <= 1) return 0;

    int startIndex = 0;
    int endIndex = 0;
    int savedNum = 0;
    int currentNum = 0;
    int currentIdx = 0;

    int result = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {

    }

    for (int i = 0; i < arr.length - 2; i++) {
      if (arr[i] > arr[i + 1]) {
        startIndex = i - 1 ;
        savedNum = arr[startIndex];
        endIndex = i;
        currentNum = arr[endIndex];
        for (int j = i + 1; j < arr.length -1 ; j++) {
          if (currentNum > arr[j]) {
            currentNum = savedNum;
            endIndex = j;
            continue;
          }

          currentNum = arr[j];
        }
        result = Math.min(result, endIndex - startIndex);
      }
    }
    return result;
  }
}
