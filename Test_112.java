package Leetcode;

import DataStructure.TreeNode;

public class Test_112 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            if(sum==root.val){
                return true;
            }
            else {
                return false;
            }
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
        System.out.print(hasPathSum(n1,12));
    }
}
