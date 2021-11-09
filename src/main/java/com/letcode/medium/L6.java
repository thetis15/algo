package com.letcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/zigzag-conversion/
6. Zigzag Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", numRows = 1
Output: "A"

Constraints:
1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
public class L6 {
  public String convert(String s, int numRows) {
    if (numRows == 1) return s;
    List<StringBuilder> result = new ArrayList<>(numRows);
    for (int i = 0; i <= numRows; i++) {
      result.add(new StringBuilder());
    }

    int idx = 0;
    boolean goingDown = true;
    for (char c : s.toCharArray()) {
      StringBuilder stringBuilder = result.get(idx);
      stringBuilder.append(c);

      if (goingDown) {
        idx++;
        if (idx == numRows - 1) {
          goingDown = false;
        }
      } else {
        idx--;
        if (idx == 0) {
          goingDown = true;
        }
      }
    }

    StringBuilder sb = new StringBuilder();

    for (StringBuilder characters : result) {
      sb.append(characters.toString());
    }

    return sb.toString();
  }
}
