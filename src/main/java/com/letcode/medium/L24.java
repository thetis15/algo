package com.letcode.medium;

import com.letcode.mock.ListNode;

public class L24 {

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
   * Example 2:
   * Input: head = []
   * Output: []
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
  public ListNode swapPairsMine(ListNode head) {
    ListNode res = head;
    int tempValue;
    while (head != null && head.next != null) {
      tempValue = head.val;
      head.val = head.next.val;
      head.next.val = tempValue;
      head = head.next.next;
    }

    return res;
  }

  public ListNode swapPairs(ListNode head) {
    if ((head == null) || (head.next == null)) {
      System.out.println(">>>> return head:[" + head + "]");
      return head;
    }

    ListNode n = head.next;
    System.out.println("> n:" + n);
    head.next = swapPairs(head.next.next);
    System.out.println(">> head.next. " + head.next);
    System.out.println(">> head" + head);
    n.next = head;
    return n;
  }


}
