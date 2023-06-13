package com.mingshasha.practice.leetcode.l055;

import org.junit.Assert;
import org.junit.Test;

public class Solution_l055_Test {

    Solution_l055 solutionL055 = new Solution_l055();

    @Test
    public void test_case01() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        boolean result = solutionL055.canJump(nums);
        Assert.assertTrue(result);
    }

    @Test
    public void test_case02() {
        int[] nums = new int[]{3, 2, 1, 0, 4};
        boolean result = solutionL055.canJump(nums);
        Assert.assertFalse(result);
    }

    @Test
    public void test_case03() {
        int[] nums = new int[]{0};
        boolean result = solutionL055.canJump(nums);
        Assert.assertTrue(result);
    }
}
