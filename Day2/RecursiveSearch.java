// the question is that you have to find the element if it exists then return their index and if it does not exists then you have to return the -1 from linkedlist recursivily

public class RecursiveSearch {
    class Node(){
        int data;
        Node next;
        public Node(int data){
        this.data=data;
next=null;
        }
    }
    int recursivily(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key)
        return 0;
       
         int index=recursivily(head.next, key);

         if(index==-1){
            return -1;
         }
         else
         return index+1;
    }
}
