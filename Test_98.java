package Leetcode;

import DataStructure.TreeNode;

import java.util.LinkedList;

public class Test_98 {
    public boolean isValidBST(TreeNode root) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        inorder(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return  false;
            }
        }
        return true;
    }

    public void inorder(TreeNode root,LinkedList<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
