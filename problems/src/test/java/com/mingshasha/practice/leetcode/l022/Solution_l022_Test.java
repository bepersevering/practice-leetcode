package com.mingshasha.practice.leetcode.l022;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Solution_l022_Test {

    Solution_l022 solutionL022 = new Solution_l022();

    @Test
    public void test_case01() {
        int n = 3;
        List<String> result = solutionL022.generateParenthesis(n);

        List<String> except = Lists.newArrayList("((()))", "(()())", "(())()", "()(())", "()()()");

        Assert.assertEquals(result.toString(), except.toString());
    }

    @Test
    public void test_case02() {

    }
}
