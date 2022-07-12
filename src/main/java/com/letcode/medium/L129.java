package com.letcode.medium;

import com.letcode.mock.TreeNode;

// https://leetcode.com/problems/sum-root-to-leaf-numbers/
/*
You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.



Example 1: https://assets.leetcode.com/uploads/2021/02/19/num1tree.jpg


Input: root = [1,2,3]
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.

Example 2: https://assets.leetcode.com/uploads/2021/02/19/num2tree.jpg


Input: root = [4,9,0,5,1]
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.


Constraints:

The number of nodes in the tree is in the range [1, 1000].
0 <= Node.val <= 9
The depth of the tree will not exceed 10.
 */
/*
시간 복잡도 O(n)
공간 복잡도 O(n)
 */
// todo 나중에 다시 풀어보긔~
public class L129 {
  public int sumNumbers(TreeNode root) {
    System.out.println("sumMine started");
    return sumMine(root, 0);
  }

  private int sumMine(TreeNode n, int nodeSum) {
    if (n == null) {
      System.out.printf(">>> nodeSum: [%s]%n", nodeSum);
      return 0;
    }
    if (n.right == null && n.left == null) {
      int i = nodeSum * 10 + n.val;
      System.out.printf("fin. nodeSum: [%s], n.val: [%s]\n",
          nodeSum, n.val);
      return i;
    }
    int leftSum = sumMine(n.left, nodeSum * 10 + n.val);
    int rightSum = sumMine(n.right, nodeSum * 10 + n.val);
    System.out.printf(
        "rightSum: [%s]\tleftSum: [%s]\tnodeSum: [%s]\tnode: [%s]\n",
        rightSum, leftSum, nodeSum, n.val);
    return leftSum + rightSum;
  }

  private int sumMineRec(TreeNode left, int result) {
    return 0;
  }

























  private int sumAns(TreeNode n, int nodeSum) {
    if (n == null) return 0;
    if (n.right == null && n.left == null) return nodeSum * 10 + n.val;
    int leftSum = sumAns(n.left, nodeSum * 10 + n.val);
    int rightSum = sumAns(n.right, nodeSum * 10 + n.val);
    return leftSum + rightSum;
  }
}