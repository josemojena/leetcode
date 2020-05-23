package com.leetcode.prob_235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {

    Boolean[] visited = new Boolean[10000];
    public int maxDepth(Node root) {
        for (int  i = 0; i < visited.length; ++i){
            visited[i] = false;
        }
        int depth = 0;
        dfs(root, depth);
        return 0;
    }

    private int dfs(Node root, int depth){
       visited[root.val] = true;
       depth++;

       for(int i =0; i  < root.children.size(); i++){
           if(visited[root.children.get(i).val] == false){
               dfs(root.children.get(i), depth);
           }
       }

       return depth;

    }
}