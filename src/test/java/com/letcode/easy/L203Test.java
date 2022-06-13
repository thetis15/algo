package com.letcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.letcode.mock.ListNode;
import org.junit.jupiter.api.Test;

class L203Test {
  private L203 l = new L203();

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
   * Constraints:
   *
   * The number of nodes in the list is in the range [0, 104].
   * 1 <= Node.val <= 50
   * 0 <= val <= 50
   */
  @Test
  void test1() {
    assertEquals(ListNode.of(1,2,3,4,5), l.removeElements(ListNode.of(1,2,6,3,4,5,6),6));
  }

  /**
   * https://leetcode.com/problems/remove-linked-list-elements/
   *
   * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
   *<br />
   *<img src="https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg" />
   *<br />
   *
   * Example 2:
   * Input: head = [], val = 1
   * Output: []
   *
   * Constraints:
   *
   * The number of nodes in the list is in the range [0, 104].
   * 1 <= Node.val <= 50
   * 0 <= val <= 50
   */
  @Test
  void test2() {
    assertEquals(ListNode.of().toArrData(), l.removeElements(ListNode.of(),1).toArrData());
  }

  /**
   * https://leetcode.com/problems/remove-linked-list-elements/
   *
   * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
   *<br />
   *<img src="https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg" />
   *<br />
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
  @Test
  void test3() {
    assertEquals(new int[]{} , l.removeElements(ListNode.of(7,7,7,7),7).toArrData());
  }

}