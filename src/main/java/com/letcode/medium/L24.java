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

  public ListNode swapPairs(ListNode head) {
    return swapPairsAnsMine(head);
  }

  private ListNode swapPairsAnsMine(ListNode head) {
    int tempVal = 0;
    ListNode root = head;

    while (head != null && head.next != null) {
      tempVal = head.val;
      head.val = head.next.val;
      head.next.val = tempVal;
      head = head.next.next;
    }
/*
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output:       [7,9,6,6,8,7,3,0,9,5]
 */
    return root;
  }




















  public ListNode swapPairsAns(ListNode head) {
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


}
