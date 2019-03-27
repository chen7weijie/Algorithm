package Leetcode;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

import static java.lang.Integer.MIN_VALUE;

public class Test_515 {
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return null;
        }
        Queue<TreeNode> nodeQueue=new LinkedList<>();
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()){
            int max=MIN_VALUE;
            int count=nodeQueue.size();
            while (count>0){
                if(max<nodeQueue.peek().val){
                    max=nodeQueue.peek().val;
                }
                TreeNode tempNode= nodeQueue.poll();
                if(tempNode.left!=null){
                    nodeQueue.offer(tempNode.left);
                }
                if(tempNode.right!=null){
                    nodeQueue.offer(tempNode.right);
                }
                count--;
            }
            list.add(max);
        }
        return list;
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
        List<Integer> list=largestValues(n1);
        for (Integer i:list){
            System.out.print(i+" ");
        }
    }
}
