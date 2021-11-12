package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class L17Test {
  L17 r = new L17();

  /*
  Example 1: https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png
  Input: digits = "23"
  Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

   */
  @Test
  void testCase1() {
    assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
        r.letterCombinations("23"));
  }

  /*
  Example 2:
  Input: digits = ""
  Output: []
   */
  @Test
  void testCase2() {
    assertEquals(Collections.emptyList(), r.letterCombinations(""));
  }

  /*
  Example 3:
  Input: digits = "2"
  Output: ["a","b","c"].
   */
  @Test
  void testCase3() {
    assertEquals(Arrays.asList("a", "b", "c"), r.letterCombinations("2"));
  }

  @Test
  void testCase4() {
    assertEquals(
        Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh",
            "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh",
            "cei", "cfg", "cfh", "cfi"), r.letterCombinations("234"));
  }
}