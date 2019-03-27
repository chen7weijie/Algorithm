package Leetcode;

import DataStructure.TreeNode;

import java.util.List;

public class Test_404 {
    static int sum=0;
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        preVisit(root);
        return sum;
    }

    public static void preVisit(TreeNode root){
        if(root.left!=null){
            if(root.left.left==null&&root.left.right==null){
                sum+=root.left.val;
            }
            else {
                preVisit(root.right);
            }
        }
        if(root.right!=null){
            preVisit(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(9);
        TreeNode n3=new TreeNode(20);
        TreeNode n4=new TreeNode(15);
        TreeNode n5=new TreeNode(7);
        n1.left=n2;
        n1.right=n3;
        n3.left=n4;
        n3.right=n5;
        System.out.print(sumOfLeftLeaves(n1));

    }
}
