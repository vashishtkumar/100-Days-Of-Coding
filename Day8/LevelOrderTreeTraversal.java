
//tc=o(n) sc=o(n);
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<Node> queue=new LinkedList<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            Node currNode=queue.remove();
            arr.add(currNode.data);
            if(currNode.left !=null){
                queue.add(currNode.left);
            }
            if(currNode.right !=null){
                queue.add(currNode.right);
            }
        }
        return arr;
    }
}



