package com.letcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L22 {
  /**
   * https://leetcode.com/problems/generate-parentheses/
   * <p>
   * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
   * <p>
   * Example 1:
   * Input: n = 3
   * Output: ["((()))","(()())","(())()","()(())","()()()"]
   * <p>
   * Example 2:
   * Input: n = 1
   * Output: ["()"]
   * <p>
   * Constraints:
   * 1 <= n <= 8
   */
  public List<String> generateParenthesis(int n) {

    List<String> res = new ArrayList<>();
    backtrack(res, "", 0, 0, n);
    System.out.println(res);
    return res;

  }

  private void backtrack(List<String> res, String s, int open, int close, int max) {
    if (s.length() == max * 2) {
      res.add(s);
      return;
    }
    if (open < max) {
      backtrack(res, s + "(", open + 1, close, max);
    }

    if (close < open) {
      backtrack(res, s + ")", open, close + 1, max);
    }
  }

  private void backtrack1(List<String> res, String currentString, int open, int close, int max) {
    if (currentString.length() == max * 2) {
      res.add(currentString);
      return;
    }

    if (open < max) {
      backtrack(res, currentString + "(", open + 1, close, max);
    }
    if (close < open) {
      backtrack(res, currentString + ")", open, close + 1, max);
    }

  }
}
