package com.letcode.easy;

import com.letcode.mock.ListNode;

public class L21 {
  /**
   * https://leetcode.com/problems/merge-two-sorted-lists/
   * <p>
   * You are given the heads of two sorted linked lists list1 and list2.
   * <p>
   * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
   * <p>
   * Return the head of the merged linked list.
   * <br/>
   * <img src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" />
   * <br/>
   * <p>
   * <p>
   * Example 1:
   * <p>
   * <p>
   * Input: list1 = [1,2,4], list2 = [1,3,4]
   * Output: [1,1,2,3,4,4]
   * Example 2:
   * <p>
   * Input: list1 = [], list2 = []
   * Output: []
   * Example 3:
   * <p>
   * Input: list1 = [], list2 = [0]
   * Output: [0]
   * <p>
   * <p>
   * Constraints:
   * <p>
   * The number of nodes in both lists is in the range [0, 50].
   * -100 <= Node.val <= 100
   * Both list1 and list2 are sorted in non-decreasing order.
   */

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    return mergeTwoListsAnswer(list1, list2);
  }

  public ListNode mergeTwoListsMy(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    if (list1.val <  list2.val) {
      list1.next = mergeTwoListsMy(list1.next, list2);
      return list1;
    } else {
      list2.next = mergeTwoListsMy(list1, list2.next);
      return list2;
    }
  }

  public ListNode mergeTwoListsAnswer(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    if (list1.val < list2.val) {
      ListNode next = mergeTwoListsMy(list1.next, list2);
      System.out.println("next: " + next);
      list1.next = next;
      return list1;
    } else {
      ListNode next = mergeTwoListsMy(list1, list2.next);
      System.out.println("next: " + next);
      list2.next = next;
      return list2;
    }
  }
}
