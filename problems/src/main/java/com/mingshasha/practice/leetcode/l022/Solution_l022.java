package com.mingshasha.practice.leetcode.l022;

import java.util.ArrayList;
import java.util.List;

public class Solution_l022 {
    public List<String> generateParenthesis(int n) {
        if (0 >= n) {
            return new ArrayList<String>();
        }

        StringBuilder track = new StringBuilder();
        List<String> result = new ArrayList<String>();
        backtrack(n, n, track, result);
        return result;
    }

    private void backtrack(int left, int right, StringBuilder track, List<String> result) {
        if (left < right) {
            return;
        }
        if (left < 0 || right < 0) {
            return;
        }
        if (0 == left && 0 == right) {
            result.add(track.toString());
            return;
        }

        track.append(")");
        backtrack(left - 1, right, track, result);
        track.deleteCharAt(track.length() - 1);

        track.append("(");
        backtrack(left, right - 1, track, result);
        track.deleteCharAt(track.length() - 1);
    }
}