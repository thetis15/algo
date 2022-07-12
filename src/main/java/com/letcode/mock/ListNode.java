package com.letcode.mock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode of(Collection<Integer> list) {
    int[] ints = list.stream().mapToInt(i -> i).toArray();

    return of(ints);
  }

  public static ListNode of(int... args) {
    if (args.length == 0) return new ListNode();
    ListNode head = new ListNode();
    ListNode temp;
    temp = head;
    for (int val : args) {
      temp.next = new ListNode(val);
      temp = temp.next;
    }
    return head.next;
  }

  public List<Integer> toListData() {
    List<Integer> result = new ArrayList<>();
    ListNode tmp = this;
    while (tmp != null) {
      result.add(tmp.val);
      tmp = tmp.next;
    }

    return result;
  }

  public int[] toArrData() {
    return toListData().stream().mapToInt(Integer::intValue).toArray();

  }

  public String toString() {
    List<String> collect = toListData().stream()
        .map(String::valueOf)
        .collect(Collectors.toList());

    return String.join(", ", collect);
  }
}
