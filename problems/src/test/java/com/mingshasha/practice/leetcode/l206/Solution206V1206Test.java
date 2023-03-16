package com.mingshasha.practice.leetcode.l206;

import com.mingshasha.practice.leetcode.common.ListNode;
import com.mingshasha.practice.leetcode.common.ListNodeUtil;
import org.junit.Test;

public class Solution206V1206Test {

    @Test
    public void test01() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        ListNode head = ListNodeUtil.toListNode(data);
        ListNodeUtil.printListNode(head);

        ListNode result = new Solution_206_V1().reverseList(head);
        ListNodeUtil.printListNode(result);
    }

    @Test
    public void test02() {
        int[] data = new int[]{1, 2};
        ListNode head = ListNodeUtil.toListNode(data);
        ListNodeUtil.printListNode(head);
        ListNode result = new Solution_206_V1().reverseList(head);
        ListNodeUtil.printListNode(result);
    }
}
