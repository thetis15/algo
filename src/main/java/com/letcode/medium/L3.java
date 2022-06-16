package com.letcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string s, find the length of the longest substring without repeating characters.


Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

 */
/*
시간 복잡도(Time Complexity) TC: O(N)
공간 복잡도(Space Complexity) SC: O(N)
 */
public class L3 {
  public int lengthOfLongestSubstring(String s) {
    return lengthOfLongestSubstringMine(s);
  }

  public int lengthOfLongestSubstringMine(String s) {
    if (s.length() <= 1) return s.length();
    Set<Character> saved = new HashSet<>();
    int length = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (saved.contains(c)) {
        length = Math.max(length, saved.size());
        i = i - (saved.size());
        saved.clear();
      } else {
        saved.add(c);
      }
    }

    return Math.max(length, saved.size());
  }

  public int lengthOfLongestSubstringAns(String s) {
    if (s.length() <= 1) {
      return s.length();
    }

    Map<Character, Integer> map = new HashMap<>();

    int result = 0;
    char[] chars = s.toCharArray();
    int tmp = 0;

    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (map.containsKey(c)) {
        result = Math.max(result, tmp);
        i = map.get(c);
        tmp = 0;
        map.clear();
      } else {
        map.put(chars[i], i);
        tmp++;
      }
    }

    return Math.max(result, tmp);
  }
}
