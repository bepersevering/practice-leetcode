package com.mingshasha.practice.leetcode.l055;

public class Solution_l055 {

    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = goal - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

//    public boolean canJump(int[] nums) {
//        if (null == nums || 0 == nums.length) {
//            return false;
//        }
//
//        int longest = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            longest = max(longest, i + nums[i]);
//            if (longest <= i) {
//                return false;
//            }
//        }
//        return longest >= nums.length - 1;
//    }
//
//    int max(int a, int b) {
//        return a > b ? a : b;
//    }
}