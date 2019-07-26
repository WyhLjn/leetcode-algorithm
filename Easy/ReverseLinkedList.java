package com.wyh.me.leetcode.easy;

import java.util.HashSet;

/**
 * Title: ReverseLinkedList.java<br>
 * Description:
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月27日 17:31:00
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            // 保存next
            ListNode next = head.next;
            // 将前面的元素关联到next后面
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newHead = new ReverseLinkedList().reverseList(head);
        System.out.println("");

        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add(null);

    }
}
