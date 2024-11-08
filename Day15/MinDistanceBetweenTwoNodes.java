public interface MinDistanceBetweenTwoNodes {

    //tc=O(n) sc=O(1);
    class GfG {
    
        Node lca(Node root,int a,int b){
            if(root==null || root.data==a || root.data==b){
                return root;
            }
            
            Node left=lca(root.left,a,b);
            Node right=lca(root.right,a,b);
            
            if(left==null){
                return right;
            }
            if(right==null){
                return left;
            }
            
            return root;
        }
        
        
        int mindist(Node root,int a){
            if(root==null){
                return -1;
            }
            
            if(root.data==a){
                return 0;
            }
            
            int left=mindist(root.left,a);
            int right=mindist(root.right,a);
            
            if(left==-1 && right==-1){
                return -1;
            }
            else if(left==-1){
                return right+1;
            }
            else
            return left+1;
            
            
        }
        
        int findDist(Node root, int a, int b){
             Node LCA=lca(root,a,b);
            
            int dist1=mindist(LCA,a);
            int dist2=mindist(LCA,b);
            
             return dist1+dist2;
        }
    }
}
