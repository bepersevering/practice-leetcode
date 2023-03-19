package com.mingshasha.practice.leetcode.l160;

import com.mingshasha.practice.leetcode.common.ListNode;
import com.mingshasha.practice.leetcode.common.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class Solution_160_V1_Test {

    @Test
    public void test_01() {
        int[] listA = {4, 1}, listB = {5, 6, 1};
        ListNode nodeA = ListNodeUtil.toListNode(listA);
        ListNode nodeB = ListNodeUtil.toListNode(listB);
        ListNode node = new ListNode(8, new ListNode(4, new ListNode(5)));
        nodeA.next = node;
        nodeB.next = node;

        ListNode intersectionNode = new Solution_160_V1().getIntersectionNode(nodeA, nodeB);
        Assert.assertTrue("ok", 8 == intersectionNode.val);
    }
}
