package Leetcode;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*给定一个二叉树，返回它的 后序 遍历。
        示例:

        输入: [1,null,2,3]
        1
        \
          2
        /
      3

        输出: [3,2,1]
        进阶: 递归算法很简单，你可以通过迭代算法完成吗？*/
public class Test_145 {
    List<Integer> list=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        postOrder(root);
        return list;
    }
    public void postOrder(TreeNode root){
        if(root.left!=null){
            postOrder(root.left);
        }
        if(root.right!=null){
            postOrder(root.right);
        }
        list.add(root.val);
    }
    //迭代法，稍微改变先序遍历的迭代法，使得入栈顺序为根左右，然后改变list顺序
    public List<Integer> postorderTraversal2(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
       while (!stack.isEmpty()){
           TreeNode node=stack.pop();
           list.add(0,node.val);
           if(node.left!=null){
               stack.push(node.left);
           }
           if(node.right!=null){
               stack.push(node.right);
           }
       }
        return list;
    }
}
