package Day3;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class leetCode19RemoveNthNodefromlastoflinkedlisT {
    class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null){
        return null;
       } 
       if(head.next==null)
       return null;
       ListNode p1,p2;
        p1=head;
        p2=head;
       while(n>0){
        p2=p2.next;
        n--;
       }
       if(p2==null)
       return p1.next;

       while(p2.next!=null){
        p1=p1.next;
        p2=p2.next;
       }
      p1.next=p1.next.next;
      return head;
    }
}
}
