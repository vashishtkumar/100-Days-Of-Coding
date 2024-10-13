package Day6;

public class leetcode148MergeSortLinkedlist {
    class Solution {
        public ListNode Merge(ListNode left,ListNode right){
            ListNode merged=new ListNode(-1);
            ListNode temp=merged;
            while(left!=null && right!=null){
                if(left.val <= right.val){
                    temp.next=left;
                    left=left.next;
                    temp=temp.next;
                }
                else
                {
                    temp.next=right;
                    right=right.next;
                    temp=temp.next;
                }
            }
    
            while(left!=null){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            while(right!=null){
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
    
            return merged.next;
        }
        public ListNode MidNode(ListNode temp){
            ListNode slow,fast;
            slow=temp;
            fast=temp.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public ListNode sortList(ListNode head) {
            if(head==null || head.next==null)
                return head;
             ListNode mid=MidNode(head);
             ListNode RightNode=mid.next;
             mid.next=null;
             ListNode left=sortList(head);
             ListNode right=sortList(RightNode);
    
             return Merge(left,right);
    
        }
    }
}
