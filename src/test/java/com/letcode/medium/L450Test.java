package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.letcode.Helper;
import com.letcode.mock.TreeNode;
import org.junit.jupiter.api.Test;

class L450Test {
  L450 r = new L450();

  /*

Example 1: https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

Example 2: https://assets.leetcode.com/uploads/2020/09/04/del_node_supp.jpg
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.

Example 3:
Input: root = [], key = 0
Output: []

   */
  @Test
  void testCast1() {
    TreeNode root = new TreeNode();
    root.val = 5;
    final TreeNode left1 = new TreeNode(3, new TreeNode(2), new TreeNode(4));
    final TreeNode right = new TreeNode(6, null, new TreeNode(7));

    root.left = left1;
    root.right = right;

    final TreeNode treeNode = r.deleteNode(root, 3);
    System.out.println(treeNode);
    System.out.println("#############");

  }
}