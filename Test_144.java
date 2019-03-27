package Leetcode;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test_144 {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode p=stack.pop();
            list.add(p.val);
            if(p.right!=null){
                stack.push(p.right);
            }
            if(p.left!=null){
                stack.push(p.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(3);
        TreeNode t3=new TreeNode(2);
        TreeNode t4=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(7);
        n1.left=n2;
        n1.right=n3;
        n2.right=n4;
        n3.right=n5;
        List<Integer> list=preorderTraversal(n1);
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
}
