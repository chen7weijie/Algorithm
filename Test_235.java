package Leetcode;

import DataStructure.TreeNode;

import java.util.ArrayList;

public class Test_235 {
    TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root,p,q);
        return result;
    }

    public  void lca(TreeNode root,TreeNode p,TreeNode q){
        if((root.val-p.val)*(root.val-q.val)<=0){
            result=root;
        }
        else if(root.val<p.val&&root.val<q.val){
            lca(root.right,p,q);
        }
        else {
            lca(root.left,p,q);
        }
    }

}
