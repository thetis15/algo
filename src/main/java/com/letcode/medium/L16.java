package com.letcode.medium;

import java.util.Arrays;

/*
https://leetcode.com/problems/3sum-closest/

16. 3Sum Closest

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0


Constraints:
3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-104 <= target <= 104

TC N^2
SC 1
 */
public class L16 {
  public int threeSumClosest(int[] nums, int target) {
    return threeSumClosestMine(nums, target);
  }

  private int threeSumClosestMine(int[] nums, int target) {
    return threeSumClosestAns(nums, target);
  }









  private int threeSumClosestAns(int[] nums, int target) {
    if (nums.length <= 3) {
      return Arrays.stream(nums).sum();
    }
    Arrays.sort(nums);
    int sum = Integer.MAX_VALUE;
    int result = Integer.MAX_VALUE;
    int lastSumTarget = Integer.MAX_VALUE;
    int left = 0, right = nums.length;
    int sumMinusTarget;

    for (int i = 0; i < nums.length - 2; i++) {
      left = i + 1;
      right = nums.length - 1;

      while (left < right) {
        sum = nums[i] + nums[left] + nums[right];
        sumMinusTarget = sum - target;
        if (Math.abs(sumMinusTarget) < Math.abs(lastSumTarget) ) {
          lastSumTarget = sumMinusTarget;
          result = sum;
        }
        if (sumMinusTarget == 0) {
          return result;
        } else if(sumMinusTarget > 0) {
          right--;
        } else {
          left++;
        }
      }

    }

    return result;
  }
}
