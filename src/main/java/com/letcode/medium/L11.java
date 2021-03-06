package com.letcode.medium;

/*
https://leetcode.com/problems/container-with-most-water/
11. Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.



Example 1: https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Example 3:
Input: height = [4,3,2,1,4]
Output: 16

Example 4:
Input: height = [1,2,1]
Output: 2


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

TC N
SC 1

 */
public class L11 {
  public int maxArea(int[] height) {
    return maxAreaMine(height);
  }

  public int maxAreaMine(int[] height) {
    int left = 0, right = height.length -1, result = 0;
    int leftVal, rightVal, areaVal;

    while (left != right) {
      leftVal = height[left];
      rightVal = height[right];
      areaVal = Math.min(leftVal, rightVal) * (right - left);
      result = Math.max(result, areaVal);

      if (leftVal > rightVal) {
        right--;
      } else if (rightVal > leftVal) {
        left++;
      } else {
        if (height[left + 1] > height[right - 1]) {
          right--;
        } else {
          left++;
        }
      }
    }

    return result;
  }





















  private int maxAreaAns(int[] height) {
    int result = 0;
    int width = 1;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      int leftBar = height[left];
      int rightBar = height[right];
      width = right - left;
      result = Math.max(result, Math.min(leftBar, rightBar) * width);

      if (leftBar > rightBar) {
        right--;
      } else {
        left++;
      }
    }

    return result;
  }
}
