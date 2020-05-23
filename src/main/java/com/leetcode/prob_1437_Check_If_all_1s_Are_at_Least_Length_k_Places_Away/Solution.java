package com.leetcode.prob_1437_Check_If_all_1s_Are_at_Least_Length_k_Places_Away;

public class Solution {

    public boolean kLengthApart(int[] nums, int k) {

        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {

                if (last != -1) {
                    if ((i + 1) - last > k) {
                        last = i + 1;
                    } else {
                        return false;
                    }
                } else {
                    last = 1;
                }
            }

        }
        return true;

    }
}