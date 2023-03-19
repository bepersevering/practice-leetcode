package com.mingshasha.practice.leetcode.l160;

import com.mingshasha.practice.leetcode.common.ListNode;

public class Solution_160_V1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            if (null == pA) {
                pA = headB;
                continue;
            }
            if (null == pB) {
                pB = headA;
                continue;
            }
            pA = pA.next;
            pB = pB.next;
        }

        return pA;
    }
}