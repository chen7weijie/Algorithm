package Leetcode;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int count=queue.size();
            int nums=count;
            double sum=0;
            while (count>0){
                TreeNode node=queue.peek();
                queue.poll();
                sum+=node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                count--;
            }
            list.add(sum/nums);
        }
        return list;
    }
}
