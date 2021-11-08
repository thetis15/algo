package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.letcode.mock.ListNode;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class L2Test {
  L2 l2 = new L2();

  /*
  Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
   */
  @Test
  void testCase1() {
    ListNode l1 = ListNode.of(2, 4, 3);
    ListNode l2 = ListNode.of(5, 6, 4);

    ListNode listNode = this.l2.addTwoNumbers(l1, l2);
    assertEquals(Arrays.asList(7, 0, 8), listNode.toListData());
  }

  /*
  Example 2:
  Input: l1 = [0], l2 = [0]
  Output: [0]
   */
  @Test
  void testCase2() {
    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(0);

    ListNode listNode = this.l2.addTwoNumbers(l1, l2);
    assertEquals(List.of(0), listNode.toListData());
  }

  /*
  Example 3:
  Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
  Output: [8,9,9,9,0,0,0,1]
   */

  @Test
  void testCase3() {
    ListNode ln9 = new ListNode(9);

    ListNode l1 = ListNode.of(9, 9, 9, 9, 9, 9, 9);
    ListNode l2 = ListNode.of(9, 9, 9, 9);

    ListNode listNode = this.l2.addTwoNumbers(l1, l2);

    assertEquals(Arrays.asList(8, 9, 9, 9, 0, 0, 0, 1), listNode.toListData());
  }
}
