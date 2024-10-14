// leet code 143 to form zigzag linkedlist
// ts=O(n)  sc=O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public void print(ListNode n){
        while(n!=null){
            System.out.print(n.val);
            n=n.next;
        }
        System.out.println("finished");
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    
    ListNode second=slow.next;
    slow.next=null;

    ListNode prev=null,curr=second,next;
    while(curr!=null){
       next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    

    
    second=prev;
    ListNode first=head;
   // print(first);
   // print(second);
    int cnt=1;
    ListNode temp;
    while(second!=null){
      if(cnt%2!=0){
        temp=second.next;
        second.next=first.next;
        first.next=second;
        second=temp;
      }
      cnt++;
       first=first.next;
    }
}
}


