package com.letcode.easy;

import com.letcode.mock.ListNode;

public class L203 {
  /**
   * https://leetcode.com/problems/remove-linked-list-elements/
   *
   * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
   *<br />
   *<img src="https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg" />
   *<br />
   *
   * Example 1:
   * Input: head = [1,2,6,3,4,5,6], val = 6
   * Output: [1,2,3,4,5]
   *
   * Example 2:
   * Input: head = [], val = 1
   * Output: []
   *
   * Example 3:
   * Input: head = [7,7,7,7], val = 7
   * Output: []
   *
   * Constraints:
   *
   * The number of nodes in the list is in the range [0, 104].
   * 1 <= Node.val <= 50
   * 0 <= val <= 50
   */
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) return null;
    head.next = removeElements(head.next, val);
    if (head.val == val) {
      head = head.next;
    }
    return head;
  }
}
