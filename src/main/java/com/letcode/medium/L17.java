package com.letcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://leetcode.com/problems/letter-combinations-of-a-phone-number/
17. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1: https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]

Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */
// todo 다시 시도 하기. 풀지 못하였음.
public class L17 {
  public List<String> letterCombinations(String digits) {
    return letterCombinationsMine(digits);
  }

  private List<String> letterCombinationsMine(String digits) {
    if (digits.length() == 0)
      return Collections.emptyList();


    List<String> result = new ArrayList<>();
    return result;
  }























  private List<String> letterCombinationsAns(String digits) {
    if (digits.length() == 0) {
      return Collections.emptyList();
    }

    Map<Character, List<Character>> data = new HashMap<>();
    int saveCount = 3;
    int lowcase = 96;
    for (int i = 2; i <= 9; i++) {
      if (i == 7 || i == 9) saveCount = 4;

      List<Character> objects = new ArrayList<>();
      for (int j = 1; j <= saveCount; j++) {
        lowcase = lowcase + 1;
        objects.add((char) lowcase);
      }
      data.put(Character.forDigit(i, 10), objects);
      saveCount = 3;
    }
    char[] chars = digits.toCharArray();
    List<String> result = new ArrayList<>();
    List<List<Character>> list = new ArrayList<>();
    for (char aChar : chars) {
      list.add(data.get(aChar));
    }

    getAlphabet(list, 0, new StringBuilder(), result);

    return result;
  }

  public void getAlphabet(List<List<Character>> list, int currentIndex, StringBuilder targetIndex, List<String> result) {
    if (list.size() -1 == currentIndex) {
      List<Character> characters = list.get(list.size() - 1);
      for (Character character : characters) {
        result.add(targetIndex.toString() + character);
      }
      return;
    }

    for (Character character : list.get(currentIndex)) {
      int length = targetIndex.length();
//      System.out.println(String.format(">> currentIndex:%s character:%s, targetIndex: %s", currentIndex, character, targetIndex.toString()));
      getAlphabet(list, currentIndex + 1, targetIndex.append(character), result);
      targetIndex.setLength(length);
    }
  }
}
