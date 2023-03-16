package com.mingshasha.practice.leetcode.l206;

import com.mingshasha.practice.leetcode.common.ListNode;

public class Solution_206_V1 {

    public ListNode reverseList(ListNode head) {
        if (null == head) {
            return null;
        }

        if (null == head.next) {
            return head;
        }

        ListNode prev = null;
        ListNode next;
        ListNode node = head;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }
}