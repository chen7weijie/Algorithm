package Leetcode;

import DataStructure.TreeNode;

public class Test_543 {
    static int diameter=0;
    public static int diameterOfBinaryTree(TreeNode root) {
        depthOfTree(root);
        return diameter;
    }

    public static int depthOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depthOfTree(root.left);
        int right=depthOfTree(root.right);
        diameter=Math.max(diameter,left+right);
        return Math.max(left,right)+1;
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
        System.out.print(diameterOfBinaryTree(n1));
    }
}
