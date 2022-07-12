package com.letcode.medium;

import java.util.Arrays;

/*
https://leetcode.com/problems/maximum-product-subarray/

152. Maximum Product Subarray
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

It is guaranteed that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.



Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 */
public class L152 {
  public int maxProduct(int[] nums) {
    return maxProductAns(nums);
//    return maxProductMine(nums);
  }

  /*
  152. Maximum Product Subarray
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
It is guaranteed that the answer will fit in a 32-bit integer.
A subarray is a contiguous subsequence of the array.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
   */
  private int maxProductMine(int[] nums) {
    if (nums.length < 2) {
      return nums[0];
    }

    int[] multiplyNums = new int[nums.length];
    multiplyNums[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      multiplyNums[i] = multiplyNums[i - 1] * nums[i];
    }

    System.out.println(Arrays.toString(multiplyNums));

    return maxProductAns(nums);
  }




















  private int maxProductAns(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int max = nums[0] * nums[1];
    int result = max;

    for (int i = 2; i < nums.length; i++) {
      final int currentVal = max * nums[i];
      if (currentVal > max) {
        max = currentVal;
      } else {
        result = max;
        max = 1;
      }
    }

    return Math.max(max, result);
  }
}
