package com.letcode.medium;

import java.awt.KeyboardFocusManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 *
 * 560. Subarray Sum Equals K
 *
 * Share
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 10^4
 * -1000 <= nums[i] <= 1000
 * -10^7 <= k <= 10^7
 */
public class L560 {

  /*
 * Share
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * 정수 배열 nums와 정수 k가 주어지면 합계가 k인 부분 배열의 총 개수를 반환합니다.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * 하위 배열은 배열 내에서 비어 있지 않은 연속적인 요소 시퀀스입니다.
 *
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
   */


  /*
   반복문을 사용하여 i~k사이의 값을 더하는 알고리즘의 시간복잡도는 O(n)이다.
 이 같은 알고리즘을 사용할 경우 n의 값이 클 경우 이를 정해진 시간 내에 해결할 수 없다.
 하지만 구간 합 알고리즘을 사용하여 구간합을 구하는 경우 O(1)의 성능을 갖는다.
 구간 합 알고리즘은 현재 진행단계까지의 인덱스까지 값의 합을 저장하는 sum[]배열을 사용한다.
 j번째 바로 앞까지의 총합에 arr[j] 값을 더하면 j번째까지의 총합을 의미하므로 sum[j] = sum[j-1] + arr[j] 로 표현할 수 있다.
   */
  public int subarraySum(int[] nums, int k) {
    System.out.println(Arrays.toString(nums));
    System.out.println("k: " + k);
    int count = 0, sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      int sumMinusK = sum - k;
      boolean contains = map.containsKey(sumMinusK);
      if (contains) {
        count += map.get(sumMinusK);
      }
      int value = map.getOrDefault(sum, 0) + 1;
      System.out.printf("""
              i: %s\tsum: %s\tsum-k[key]: %s\tcontains: %s\tcount: %s\tput:[k:%s,v:%s]
              """,
          i, sum, sumMinusK, contains, count, sum, value);
      map.put(sum, value);
    }
    System.out.println(map);
    System.out.println("k: " + k);
    return count;
  }

  private int subarraySumMine(int[] nums, int k) {
    int length = nums.length;
    int idx = 0;

    int searchIdx = 0;
    int sum = 0;
    int result = 0;

    while (idx < length) {
      searchIdx = idx;
      sum = nums[idx];


      while (searchIdx < length) {
        if (idx != searchIdx) {
          sum += nums[searchIdx];
        }

        if (sum == k) {
          result += 1;
        }
        searchIdx += 1;
      }
      idx += 1;
    }

    return result;
  }
}
