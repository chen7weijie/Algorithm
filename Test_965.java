package Leetcode;

import DataStructure.TreeNode;

import java.util.ArrayList;

public class Test_965 {
    ArrayList<Integer> list=new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        preOrder(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)!=list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void preOrder(TreeNode root){
        list.add(root.val);
        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
    }
}
