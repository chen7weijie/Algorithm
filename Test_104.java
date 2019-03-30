package Leetcode;

import DataStructure.TreeNode;

public class Test_104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left)+1;
        int rightDepth=maxDepth(root.right)+1;
        return Math.max(leftDepth,rightDepth);
    }
}
