package com.leetcode.prop_938_Range_Sum_of_BST;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class Solution {

    private int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return sum;
        }

        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }

        rangeSumBST(root.right, L, R);
        rangeSumBST(root.left, L, R);
        return sum;

    }

}
