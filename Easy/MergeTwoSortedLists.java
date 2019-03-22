package com.wyh.me.leetcode.easy;

/**
 * Title: MergeTwoSortedLists.java<br>
 * Description:
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
 * the nodes of the first two lists.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年01月24日 17:51:00
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newList = new ListNode(-1);
        // 不会丢失头结点
        ListNode cur = newList;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }

        cur.next = (l1 == null) ? l2 : l1;

        return newList.next;
    }

    public static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) { val = x; }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) {
        ListNode l1 = stringToListNode("1,3,5");
        ListNode l2 = stringToListNode("2,4,6");
        ListNode ret = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        String out = listNodeToString(ret);

        System.out.print(out);
    }
}
