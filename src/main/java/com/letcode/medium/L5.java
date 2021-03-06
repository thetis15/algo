package com.letcode.medium;


public class L5 {
  /**
  https://leetcode.com/problems/longest-palindromic-substring/
  Given a string s, return the longest palindromic substring in s.

  Example 1:
  Input: s = "babad"
  Output: "bab"
  Note: "aba" is also a valid answer.

  Example 2:
  Input: s = "cbbd"
  Output: "bb"

  Example 3:
  Input: s = "a"
  Output: "a"

  Example 4:
  Input: s = "ac"
  Output: "a"


  Constraints:

  1 <= s.length <= 1000
  s consist of only digits and English letters.
   */

  public String longestPalindrome(String s) {
    return longestPalindromeMine(s);
  }

  public String longestPalindromeMine(String s) {
    /**
     * 가장 긴 회문 찾기
     * 모든 단어를 중심으로 하나씩 회문을 찾음
     * 찾으면서 해당 회문에 대한 왼쪽과 오른쪽의 index 를 구함.
     * 길이가 길면 result 의 index 값을 변경함.
     */

    int left = 0, right = 0;

    for (int i = 0; i < s.length(); i++) {
      left = i;
      right = i;
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
      }
      System.out.println(String.format("i: %s\tlength: %s", i, right - left -1));
      if (left != right) {
        System.out.println(s.substring(left + 1, right));
      } else {
        System.out.println("no marching");
      }

      left = i;
      right = i + 1;
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
      }
      System.out.println(String.format("i: %s\tlength: %s", i, right - left -1));
      if (left != right) {
        System.out.println(s.substring(left + 1, right));
      } else {
        System.out.println("no marching");
      }


    }

    return s;
  }

  public String longestPalindromeAnswer(String s) {
    //special cases
    if (s == null || s.length() < 1) {
      return "";
    }
    //record every palindromic string location
    int left = 0, right = 0, length = 0;
    char tmp;
    for (int i = 0; i < s.length(); i++) {
      tmp = s.charAt(i);
      //odd number
      int left1 = i;
      int right1 = i;
      while (left1 >= 0 && right1 < s.length() && s.charAt(left1) == s.charAt(right1)) {
        left1--;
        right1++;
      }
      //if there is only have a character,if do not -1,it will return false
      int len1 = right1 - left1 - 1;
      //even number
      int left2 = i;
      int right2 = i + 1;
      while (left2 >= 0 && right2 < s.length() && s.charAt(left2) == s.charAt(right2)) {
        left2--;
        right2++;
      }
      //if there is only have a character,if do not -1,it will return false
      int len2 = right2 - left2 - 1;
      length = Math.max(len1, len2);
      if (length > right - left) {
        //-1 is distinguish between odd and even cases
        left = i - (length - 1) / 2;
        right = i + length / 2;
      }
    }
    return s.substring(left, right + 1);
  }

  private int findLength(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    //if there is only have a character,if do not -1,it will return false
    return right - left - 1;
  }

}
