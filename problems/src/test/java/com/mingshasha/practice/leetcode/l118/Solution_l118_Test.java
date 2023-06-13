package com.mingshasha.practice.leetcode.l118;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Solution_l118_Test {

    Solution_l118 solutionL118 = new Solution_l118();

    @Test
    public void test_case1() {
        int numRows = 5;
        List<List<Integer>> result = solutionL118.generate(numRows);

        String expected = result.toString().replaceAll(" ", "");
        Assert.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]", expected);

        for (int i = 6; i <= 20; i++) {
            System.out.println(solutionL118.generate(i));
        }
    }

    @Test
    public void test_case2() {
        int numRows = 1;
        List<List<Integer>> result = solutionL118.generate(numRows);

        Assert.assertEquals("[[1]]", result.toString());
    }
}
