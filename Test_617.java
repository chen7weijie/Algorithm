package Leetcode;

import DataStructure.TreeNode;

public class Test_617 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        t1=merge(t1, t2);
        return t1;
    }
    public static TreeNode merge(TreeNode t1,TreeNode t2){
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        t1.val+=t2.val;
        t1.left=merge(t1.left,t2.left);
        t1.right=merge(t1.right,t2.right);
        return  t1;
    }

    public static void preVisit(TreeNode t1){
        System.out.print(t1.val+" ");
        if(t1.left!=null){
            preVisit(t1.left);
        }
        if(t1.right!=null){
            preVisit(t1.right);
        }
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
        t1=mergeTrees(t1,n1);
        preVisit(t1);
    }
}
