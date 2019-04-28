package Leetcode.Tree;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int res=0;
        if(root==null){
            return 0;
        }
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(root.val>=L&&root.val<=R){
                res+=root.val;
            }
            root=root.right;
        }
        return res;
    }
}
