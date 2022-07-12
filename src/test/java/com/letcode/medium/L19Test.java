package com.letcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.letcode.mock.ListNode;

/**
 * Created by han on 2022/05/29
 * email : thetis15@hanmail.net
 */
class L19Test {

	private final L19 s = new L19();

	/**
	 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
	 *
	 * Example 1:
	 * Input: head = [1,2,3,4,5], n = 2
	 * Output: [1,2,3,5]
	 *
	 * Constraints:
	 *
	 * The number of nodes in the list is sz.
	 * 1 <= sz <= 30
	 * 0 <= Node.val <= 100
	 * 1 <= n <= sz
	 *
	 */
	@Test
	void test1() {
		ListNode result = s.removeNthFromEnd(ListNode.of(1, 2, 3, 4, 5), 2);

		assertEquals(Arrays.asList(1,2,3,5), result.toListData());
	}

	/**
	 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
	 * Example 2:
	 * Input: head = [1], n = 1
	 * Output: []

	 * Constraints:
	 *
	 * The number of nodes in the list is sz.
	 * 1 <= sz <= 30
	 * 0 <= Node.val <= 100
	 * 1 <= n <= sz
	 *
	 */
	@Test
	void test2() {
		ListNode result = s.removeNthFromEnd(ListNode.of(1), 1);

		assertEquals(Arrays.asList(), result.toListData());

	}

	/**
	 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
	 *
	 * Example 3:
	 * Input: head = [1,2], n = 1
	 * Output: [1]
	 *
	 * Constraints:
	 *
	 * The number of nodes in the list is sz.
	 * 1 <= sz <= 30
	 * 0 <= Node.val <= 100
	 * 1 <= n <= sz
	 *
	 */
	@Test
	void test3() {
		ListNode result = s.removeNthFromEnd(ListNode.of(1, 2), 1);

		assertEquals(Arrays.asList(1), result.toListData());

	}
}