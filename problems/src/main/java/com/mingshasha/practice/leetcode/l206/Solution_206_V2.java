package com.mingshasha.practice.leetcode.l206;

import com.mingshasha.practice.leetcode.common.ListNode;

import java.util.List;

public class Solution_206_V2 {
    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}