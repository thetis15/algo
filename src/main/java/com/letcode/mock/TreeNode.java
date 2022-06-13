package com.letcode.mock;

//  Definition for a binary tree node.
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {
  }

  public static TreeNode of(int val, TreeNode left, TreeNode right) {
    return new TreeNode(val, left, right);
  }

  public static TreeNode of(int val) {
    return new TreeNode(val);
  }

  @Override
  public String toString() {

    return toStringGenerator(this, "");
  }

  private String toStringGenerator(TreeNode treeNode, String toString) {
    if (treeNode == null) return toString;

    if (toString.equals("")) {
      toString += treeNode.val;
    } else {
      toString += ", " + treeNode.val;
    }

    if (treeNode.left != null) {
      toString = toStringGenerator(treeNode.left, toString);
    }

    if (treeNode.right != null) {
      toString = toStringGenerator(treeNode.right, toString);
    }

    return toString;
  }


  private TreeNode(int val) {
    this.val = val;
  }

  private TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
