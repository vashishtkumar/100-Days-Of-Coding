leetcode 543

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public int height(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     return Math.max(lh,rh)+1;
    // }
    // public int diameterOfBinaryTree(TreeNode root) {
    //   if(root==null)
    //   return 0;
    //   int ld=diameterOfBinaryTree(root.left);
    //   int rd=diameterOfBinaryTree(root.right);
    //   int lh=height(root.left);
    //   int rh=height(root.right);

    //   int selfd=lh+rh;

    //   return Math.max(selfd,Math.max(ld,rd));

        
    // }
     //tc=o(n),sc=o(1);
    int Treeheight(TreeNode root,int []diameter){
        if(root==null)
        return 0;

        int lh=Treeheight(root.left,diameter);
        int rh=Treeheight(root.right,diameter);
   
        diameter[0]=Math.max(diameter[0],lh+rh);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[]=new int[1];
        Treeheight(root,diameter);
        return diameter[0];
    }
}