// tc=O(n) sc=O(1);

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        return null;

        ListNode curr,prev,next;
        prev=null;
        curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}