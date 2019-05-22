package com.wyh.me.leetcode.easy;

/**
 * Title: LinkedListCycle.java<br>
 * Description:
 *
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 *
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 *
 * Example 2:
 *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *
 *
 * Example 3:
 *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月07日 17:41:00
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        // 快指针比慢指针每次多走一步，如果有环，快指针肯定会追上慢指针
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
