package com.leetcode.prob_1403_Minimum_Subsequence_in_Non_Increasing_Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@TODO See the problem description at Readme.md
public class Solution {

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);
        int total = 0;
        int totalSequence = 0;

        for (int i = 0; i < nums.length; ++i) total += nums[i];
        for (int i = nums.length - 1; i >= 0; i--) {
            totalSequence += nums[i];
            answer.add(nums[i]);

            if ((totalSequence) > (total - totalSequence)) {
                break;
            }
        }
        return answer;
    }
}