package com.letcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.letcode.mock.ListNode;
import org.junit.jupiter.api.Test;

class L21Test {
  L21 l = new L21();

  /**
   * https://leetcode.com/problems/merge-two-sorted-lists/
   *
   * You are given the heads of two sorted linked lists list1 and list2.
   *
   * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
   *
   * Return the head of the merged linked list.
   *
   * Example 1:
   * Input: list1 = [1,2,4], list2 = [1,3,4]
   * Output: [1,1,2,3,4,4]
   *
   * Constraints:
   *
   * The number of nodes in both lists is in the range [0, 50].
   * -100 <= Node.val <= 100
   * Both list1 and list2 are sorted in non-decreasing order.
   */

  @Test
  void test1() {
    ListNode result = l.mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4));
    assertEquals(ListNode.of(1, 1, 2, 3, 4, 4).toString(), result.toString());
  }

  /**
   * https://leetcode.com/problems/merge-two-sorted-lists/
   *
   * You are given the heads of two sorted linked lists list1 and list2.
   *
   * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
   *
   * Return the head of the merged linked list.
   *
   * Example 2:
   * Input: list1 = [], list2 = []
   * Output: []
   *
   * Constraints:
   *
   * The number of nodes in both lists is in the range [0, 50].
   * -100 <= Node.val <= 100
   * Both list1 and list2 are sorted in non-decreasing order.
   */

  @Test
  void test2() {
    ListNode result = l.mergeTwoLists(ListNode.of(), ListNode.of());
    assertEquals(ListNode.of().toString(), result.toString());
  }

  /**
   * https://leetcode.com/problems/merge-two-sorted-lists/
   *
   * You are given the heads of two sorted linked lists list1 and list2.
   *
   * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
   *
   * Return the head of the merged linked list.
   *
   * Example 3:
   * Input: list1 = [], list2 = [0]
   * Output: [0]
   *
   * Constraints:
   *
   * The number of nodes in both lists is in the range [0, 50].
   * -100 <= Node.val <= 100
   * Both list1 and list2 are sorted in non-decreasing order.
   */

  @Test
  void test3() {
    ListNode result = l.mergeTwoLists(ListNode.of(), ListNode.of(0));
    assertEquals(ListNode.of(0).toString(), result.toString());
  }
}