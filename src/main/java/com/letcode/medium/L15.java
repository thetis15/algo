package com.letcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/3sum/
15. 3Sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */
public class L15 {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int N = nums.length;
    Arrays.sort(nums);

    // If we have less than 3 element there is no valid subset
    // If we have min value greater than 0, it's not possible to produce subset where count is zero
    // If we have max value less than 0, it's not possible to produce subset where count is zero
    if(N < 3 || nums[0] > 0 || nums[N-1] < 0)
      return result;

    for(int i = 0; i < N - 2; i++) {
      // current i is same as previous, it will create duplicate result
      if(i > 0 && nums[i] == nums[i-1])
        continue;

      int left = i + 1, right = N - 1;
      while(left < right) {
        int sum = nums[left] + nums[right] + nums[i];
        if(sum == 0) {
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));

          // if we have duplicate elements, we need get rid of it so we are moving left and right pointer to a position
          // where there's no duplicate elements.
          while(left < right && nums[left] == nums[left + 1])
            left++;
          while(left < right && nums[right] == nums[right - 1])
            right--;
          left++;
          right--;
        }
        else if(sum > 0)
          left++;
        else
          right--;
      }
    }

    return result;
  }

  public List<List<Integer>> threeSumByMe(int[] nums) {
    if (nums.length <= 1) {
      return Collections.emptyList();
    }

    nums = Arrays.stream(nums).sorted().toArray();
    List<List<Integer>> result = new ArrayList<>();
    int zeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0) {
        zeroIndex = i;
        break;
      }
    }
    int inum = 0;
    int jnum = 0;
    int knum = 0;
    for (int i = 0; i < nums.length -2 ; i++) {
      inum = nums[i];
      if (inum > 0) break;
      for (int j = i + 1; j < nums.length -1 ; j++) {
        jnum = nums[j];
        if (inum + jnum > 0) break;
//        for (int k = nums.length - 1; k > j + 1; k--) {
        for (int k = Math.max(zeroIndex, j + 1); k < nums.length; k++) {
          knum = nums[k];
          if (inum + jnum + knum == 0) {
            List<Integer> e = Arrays.asList(inum, jnum, knum);
            List<Integer> integers = e.stream().sorted().collect(Collectors.toList());
            if (!result.contains(integers)) {
              result.add(integers);
            }
          } else if (inum + jnum + knum < 0) {
            break;
          }
        }
      }
    }

    return result;
  }
}
