package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.letcode.medium.com.thetis15.util.PropertiesUtil;
import java.util.Properties;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class L11Test {
  L11 r = new L11();
  PropertiesUtil propertiesUtil = new PropertiesUtil();

  /*
  Example 1: https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
   */
  @Test
  void testCase1() {
    assertEquals(49, r.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }

  /*
Example 2:
Input: height = [1,1]
Output: 1
   */
  @Test
  void testCase2() {
    assertEquals(1, r.maxArea(new int[] {1, 1}));
  }

  /*
Example 3:
Input: height = [4,3,2,1,4]
Output: 16
   */
  @Test
  void testCase3() {
    assertEquals(16, r.maxArea(new int[] {4, 3, 2, 1, 4}));
  }

  /*
Example 4:
Input: height = [1,2,1]
Output: 2
   */
  @Test
  void testCase4() {
    assertEquals(2, r.maxArea(new int[] {1, 2, 1}));
  }

  /*
  big data
  https://leetcode.com/submissions/detail/584871017/testcase/
   */
  @Test
  @Timeout(2)
  @SneakyThrows
  void testCase5() {
    String resource = "data/L11.properties";
    Properties prop = propertiesUtil.getProperties(resource);

    String longArrayString = prop.getProperty("longArray");
    ObjectMapper objectMapper = new ObjectMapper();
    int[] ints = objectMapper.readValue(longArrayString, int[].class);
    long start = System.currentTimeMillis();
    System.out.println(r.maxArea(ints));
    System.out.println(String.format("run in %sms", System.currentTimeMillis() - start));
  }

}