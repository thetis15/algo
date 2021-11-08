package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.letcode.mock.TreeNode;
import org.junit.jupiter.api.Test;

class L129Test {
  private L129 l = new L129();

  @Test
  void case1Test() {
    TreeNode l1 = new TreeNode(2);
    TreeNode r1 = new TreeNode(3);
    TreeNode root = new TreeNode(1, l1, r1);
    assertEquals(l.sumNumbers(root), 25);
  }

  /*
Input: root = [4,9,0,5,1]
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
   */
  @Test
  void case2Test() {
    TreeNode l2 = new TreeNode(9, new TreeNode(5), new TreeNode(1));
    TreeNode r2 = new TreeNode(0);
    TreeNode root = new TreeNode(4, l2, r2);
    assertEquals(l.sumNumbers(root), 1026);
  }
}