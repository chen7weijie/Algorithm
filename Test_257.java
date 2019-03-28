package Leetcode;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test_257 {
     static List<String> list=new ArrayList<>();
    public static List<String> binaryTreePaths(TreeNode root) {
        if(root!=null){
            orderTree(root,"");
        }
        return list;
    }

    public static void  orderTree(TreeNode root,String str){
        if(root.left==null&&root.right==null){
            list.add(str+root.val);
            return;
        }
        if(root.left!=null){
            orderTree(root.left,str+root.val+"->");
        }
        if(root.right!=null){
            orderTree(root.right,str+root.val+"->");
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
        binaryTreePaths(n1);
        for (String str:list){
            System.out.print(str+" ");
        }
    }
}
