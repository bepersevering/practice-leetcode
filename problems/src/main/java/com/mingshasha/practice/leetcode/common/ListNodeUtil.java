package com.mingshasha.practice.leetcode.common;

public class ListNodeUtil {

    public static ListNode toListNode(int... vals) {
        if (null == vals || 0 == vals.length) {
            return null;
        }

        return nextNode(vals, 0);
    }

    private static ListNode nextNode(int[] vals, int index) {
        if (index >= vals.length) {
            return null;
        }

        return new ListNode(vals[index], nextNode(vals, index + 1));
    }

    public static void printListNode(ListNode listNode) {
        if (null == listNode) {
            return;
        }

        System.out.print("[");
        while (listNode != null) {
            System.out.printf("%d ", listNode.val);
            listNode = listNode.next;
        }
        System.out.print("]\n");
    }
}
