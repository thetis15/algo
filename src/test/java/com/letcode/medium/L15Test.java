package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.letcode.medium.com.thetis15.util.PropertiesUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

class L15Test {
  L15 r  = new L15();

  /*
  Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
   */
  @Test
  void testCase1() {
    List<Integer> integers = Arrays.asList(-1, -1, 2);
    List<Integer> integers1 = Arrays.asList(-1, 0, 1);
    List<List<Integer>> ts = Arrays.asList(integers, integers1);
    assertEquals(ts, r.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
  }

  /*
Example 2:
Input: nums = []
Output: []
   */
  @Test
  void testCase2() {
    assertEquals(Collections.emptyList(), r.threeSum(new int[] {}));
  }

  /*
Example 3:
Input: nums = [0]
Output: []
   */
  @Test
  void testCase3() {
    assertEquals(Collections.emptyList(), r.threeSum(new int[] {0}));
  }

  @SneakyThrows
  @Test
  void testCase4() {
    PropertiesUtil propertiesUtil = new PropertiesUtil();
    Properties prop = propertiesUtil.getProperties("data/L15.properties");
    String longArrayString = prop.getProperty("longArray");
    ObjectMapper objectMapper = new ObjectMapper();
    int[] ints = objectMapper.readValue(longArrayString, int[].class);
    List<List<Integer>> actual = r.threeSum(ints);
  }

  @Test
  void testCase5() {
    assertEquals(Collections.emptyList(), r.threeSum(new int[] {1, 2, -2, -1}));
  }
}