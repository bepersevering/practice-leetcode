package com.mingshasha.practice.leetcode.l118;

import java.util.ArrayList;
import java.util.List;

public class Solution_l118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> r1 = new ArrayList<Integer>();
        r1.add(1);
        result.add(r1);
        if (numRows == 1) {
            return result;
        }

        for (int i = 2; i < numRows + 1; i++) {
            List<Integer> rowList = new ArrayList<Integer>();
            rowList.add(1);
            for (int j = 0; j < i - 2; j++) {
                int t = result.get(i - 2).get(j) + result.get(i - 2).get(j + 1);
                rowList.add(t);
            }
            rowList.add(1);
            result.add(rowList);
        }
        return result;
    }
}