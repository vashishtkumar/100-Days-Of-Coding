package Day14;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class LowestAncestor {
    

    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
          
          public static boolean getpath(TreeNode root,int n,ArrayList<TreeNode> path){
            if(root==null)
            return false;

            path.add(root);
            if(root.val==n)
            return true;
            boolean foundleft=getpath(root.left,n,path);
            boolean foundright=getpath(root.right,n,path);
            if(foundleft || foundright){
                return true;
            }
            path.remove(path.size()-1);
            return false;
          }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();

        getpath(root,p.val,path1);
        getpath(root,q.val,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i))
            break;
        }
        return path1.get(i-1);
    }
}

class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
	  if(root==null || root.data==n1 || root.data==n2)
	  return root;
	
	
	Node leftlca=lca(root.left,n1,n2);
	Node rightlca=lca(root.right,n1,n2);
	
	if(leftlca==null)
	return rightlca;
	
	if(rightlca==null)
	return leftlca;
	
	return root;
}
}

tc=O(N);
}
