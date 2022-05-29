package com.letcode.medium;

/**
 * Created by han on 2022/05/29
 * email : thetis15@hanmail.net
 */

import com.letcode.mock.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * 2개의 포인터로 연산함
 * n번째를 제거 하는것은
 * 첫번째 빠른 포인터가 null 에 도달했을때 두번째 느린 포인터의 값은 null 값 index 에서 n칸 뒤에 있음.
 * 그래서 첫번째 빠른 포인터를 n만큼 이동 시킨다음에
 * 그다음으로 두 포인터 모두 빠른포인터가 null 이 될때까지 이동하고
 * 그때가 되면 느린 포인터의 다음 값은 사라져야할 n번째 값이 되므로
 * next 를 next.next로 변환 하면됨.
 */
public class L19 {

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
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode fast = head, slow = head;

		for (int i = 0; i < n; i++)fast = fast.next;

		if (fast == null) return head.next;

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;
		return head;
	}

}

