package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class L22Test {
  L22 l22 = new L22();

  /**
   * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
   *
   * Example 1:
   * Input: n = 3
   * Output: ["((()))","(()())","(())()","()(())","()()()"]
   *
   * Constraints:
   * 1 <= n <= 8
   */

  @Test
  void test1() {
    List<String> r = l22.generateParenthesis(3);
    assertEquals(Arrays.asList("((()))","(()())","(())()","()(())","()()()"), r);
  }

  /**
   * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
   *
   * Example 2:
   * Input: n = 1
   * Output: ["()"]
   *
   * Constraints:
   * 1 <= n <= 8
   */

  @Test
  void test2() {
    List<String> r = l22.generateParenthesis(1);
    assertEquals(Arrays.asList("()"), r);
  }
}