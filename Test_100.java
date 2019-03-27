package Leetcode;

import DataStructure.TreeNode;

/*给定两个二叉树，编写一个函数来检验它们是否相同。
示例 1:

输入:       1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

输出: true
示例 2:

输入:      1          1
          /           \
         2             2

        [1,2],     [1,null,2]

输出: false
示例 3:

输入:       1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

输出: false
        如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。*/
public class Test_100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null&&q!=null){
            return false;
        }
        if(p!=null&&q==null){
            return false;
        }
        if(p.val==q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        else if(p.val!=q.val){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(1);
        t1.left=t2;
        t1.right=t3;
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(1);
        n1.left=n2;
        n1.right=n3;
        System.out.print(isSameTree(t1,n1));
    }
}
