package com.letcode.medium.algo.kadane;

public class Kadane {
  int[] nums = {1, -3, -1, 2};

  public static int maxSubArray(int[] nums) {
    //배열길이가 1일떄는 더할것이 없으므로 0번지 그대로 반환
    if (nums.length == 1) {
      return nums[0];
    }
    // 해당 os의 int 범위에서의 최소값을 초기값으로 설정, 각 배열 요소의 합산 값
    int maxValInt = Integer.MIN_VALUE, sumVal = 0;
    // 1. 배열 요소를 하나씩 회전하면서 값을 더해본다 (최대 부분합을 구하기 위해서)
    for (int i = 0, j = nums.length; i < j; i++) {
      sumVal += nums[i];
      if (maxValInt < sumVal) {
        maxValInt = sumVal;
      }
      if (sumVal < 0) {
        sumVal = 0;
      }
    }
    return maxValInt;
  }
  // 2. 합산 값 대입
  // 3. 이전 합산 저장 값과 비교하여 더 큰 값이면 치환


}
