package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.letcode.medium.com.thetis15.util.PropertiesUtil;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class L560Test {
  L560 l = new L560();
  PropertiesUtil propertiesUtil = new PropertiesUtil();

  /**
   * Example 1:
   * Input: nums = [1,1,1], k = 2
   * Output: 2
   * <p>
   * <p>
   * Constraints:
   * <p>
   * 1 <= nums.length <= 2 * 10^4
   * -1000 <= nums[i] <= 1000
   * -10^7 <= k <= 10^7
   */
  @Test
  void test1() {
    assertEquals(2, l.subarraySum(new int[] {1, 1, 1}, 2));
  }

  /**
   * Example 2:
   * Input: nums = [1,2,3], k = 3
   * Output: 2
   * <p>
   * Constraints:
   * <p>
   * 1 <= nums.length <= 2 * 10^4
   * -1000 <= nums[i] <= 1000
   * -10^7 <= k <= 10^7
   */
  @Test
  void test2() {
    assertEquals(2, l.subarraySum(new int[] {1, 2, 3,}, 3));
  }

  /*
  Wrong Answer
Details
Input  [1,-1,0], 0
Expected: 3
   */
  @Test
  void test3() {
    assertEquals(3, l.subarraySum(new int[] {1, -1, 0}, 0));
  }

  /*
  Wrong Answer
Details
Input  [0,0], 0
Expected: 3
   */
  @Test
  void test4() {
    assertEquals(3, l.subarraySum(new int[] {0, 0}, 0));
  }
  /*
  Time Limit Exceeded
Details
Input  L560.properties, 0
Expected: 0
   */
  @SneakyThrows
  @Test
  @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
  void test5() {
    String resource = "data/L560.properties";
    Properties prop = propertiesUtil.getProperties(resource);

    String intArrayString = prop.getProperty("intArray");
    ObjectMapper objectMapper = new ObjectMapper();
    int[] ints = objectMapper.readValue(intArrayString, int[].class);

    System.out.println("ints length: " + ints.length);

    assertEquals(0, l.subarraySum(ints, 0));
  }
}