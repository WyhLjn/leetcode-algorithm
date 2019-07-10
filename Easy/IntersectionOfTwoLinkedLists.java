package com.wyh.me.leetcode.easy;

/**
 * Title: IntersectionOfTwoLinkedLists.java<br>
 * Description:<br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年05月08日 17:51:00
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA, b = headB;
        // 两个队列都会循环A，B所有节点，并且长度相等
        // 那么在某个位置总会碰上相同的节点
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    public static class ListNode {

        int val;

        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = new ListNode(8);
        headB.next.next.next.next = new ListNode(4);
        headB.next.next.next.next.next = new ListNode(5);

        // [4,1,8,4,5]
        // [5,0,1,8,4,5]
        System.out.println(new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB).val);
    }
}
