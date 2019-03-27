package Leetcode;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test_94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return list;
        }
        while(root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(7);
        n1.left=n2;
        n1.right=n3;
        n2.right=n4;
        n3.right=n5;
        List<Integer> list=inorderTraversal(n1);
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
}
