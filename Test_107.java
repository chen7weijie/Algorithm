package Leetcode;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> temp=new LinkedList<>();
            int count=queue.size();
            while (count>0){
                TreeNode node=queue.peek();
                queue.poll();
                temp.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                count--;
            }
            result.add(0,temp);
        }
        return result;
    }
}
