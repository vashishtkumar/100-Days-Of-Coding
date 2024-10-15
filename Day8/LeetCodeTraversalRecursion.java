package Day8;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCodeTraversalRecursion {
    // leetcode = 94 inorder traversal  ts=o(n) 
      class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       LinkedList<Integer> ll=new LinkedList<>();
       if(root==null)
       return ll;
       Queue<TreeNode> queue=new LinkedList<>();

       queue.add(root);
       while(!queue.isEmpty()){
        TreeNode currNode=queue.poll();
        ll.add(currNode.val);
        if(currNode.left!=null){
            queue.add(currNode.left);
        }
        if(currNode.right!=null){
            queue.add(currNode.right);
        }
       }
       return ll;
    }
}


}


//leetcode 144  preorder traversal

class Solution {
    LinkedList<Integer> ll=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
           if(root==null){
            return ll;
           }
           ll.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return ll;
    }
}


// leetcode 145 postorder traversal

class Solution {
    List<Integer> ll=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return ll;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ll.add(root.val);
        return ll;
    }
}
