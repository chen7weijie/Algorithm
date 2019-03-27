package Leetcode;

import DataStructure.TreeNode;

public class Test_623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode newRoot=new TreeNode(v);
            newRoot.left=root;
            return newRoot;
        }

        return null;
    }
}
