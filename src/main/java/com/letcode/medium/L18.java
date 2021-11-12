package com.letcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
https://leetcode.com/problems/4sum/
18. 4Sum
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.


Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]

Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109

 */
public class L18 {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    int left = 0, right = nums.length - 1;
    int sum;
    for (int i = 0; i < nums.length - 3; i++) {
      for (int j = i + 1; j < nums.length - 2; j++) {
        left = j + 1;
        right = nums.length - 1;
        while (left < right) {
          sum = nums[i] + nums[j] + nums[left] + nums[right];
          if (sum == target) {
            List<Integer> array = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
            if (!result.contains(array)) {
              result.add(array);
            }
          }

          if (sum - target >= 0) {
            right--;
          } else {
            left++;
          }
        }
      }

    }
    return result;
  }
}
