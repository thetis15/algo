package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.letcode.mock.ListNode;
import org.junit.jupiter.api.Test;

class L24Test {
L24 l = new L24();

  /**
   * https://leetcode.com/problems/swap-nodes-in-pairs/
   *
   * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
   * <br>
   * <img src="https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg" />
   *<br>
   *
   * Example 1:
   * Input: head = [1,2,3,4]
   * Output: [2,1,4,3]
   *
   * Constraints:
   *
   * The number of nodes in the list is in the range [0, 100].
   * 0 <= Node.val <= 100
   */
  @Test
  void test1() {
    ListNode result = l.swapPairs(ListNode.of(1, 2, 3, 4));
    assertEquals(ListNode.of(2,1,4,3).toString(), result.toString());
  }

  /**
   * https://leetcode.com/problems/swap-nodes-in-pairs/
   *
   * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
   * <br>
   * <img src="https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg" />
   * <br>
   *
   * Example 2:
   * Input: head = []
   * Output: []
   *
   * Constraints:
   *
   * The number of nodes in the list is in the range [0, 100].
   * 0 <= Node.val <= 100
   */
  @Test
  void test2() {
    ListNode result = l.swapPairs(ListNode.of());
    assertEquals(ListNode.of().toString(), result.toString());
  }

  /**
   * https://leetcode.com/problems/swap-nodes-in-pairs/
   *
   * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
   * <br>
   * <img src="https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg" />
   *
   * Example 3:
   * Input: head = [1]
   * Output: [1]
   *
   *
   * Constraints:
   *
   * The number of nodes in the list is in the range [0, 100].
   * 0 <= Node.val <= 100
   */
  @Test
  void test3() {
    ListNode result = l.swapPairs(ListNode.of(1));
    assertEquals(ListNode.of(1).toString(), result.toString());
  }
}