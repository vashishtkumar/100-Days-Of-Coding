// GFG solution tc=O(n) sc=O(n);

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        if(head==null){
            return true;
        }
        int num=0;
        Node temp=head;
        while(temp!=null){
            num=num*10+temp.data;
            temp=temp.next;
        }
        
        
        
        Node prev=null,curr=head,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        
        int num2=0;
        while(prev!=null){
            num2=num2*10+prev.data;
            prev=prev.next;
        }
        //System.out.println(num+" "+num2);
        
        if(num==num2)
        return true;
        else
        return false;
        
        
    }
}


// more optimized using slow and fast concept tc=O(n) sc=O(1);  leetcode 234

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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode slow=head,fast=head;

       // 1. finding the mid of linkedlist
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // 2. reversing the second part of linkedlist
        ListNode curr=slow,prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //3. check wether it is plainrome or not by comparing the two linkedlist

        while(prev!=null){
            if(head.val!=prev.val)
            return false;
            head=head.next;
            prev=prev.next;
        }

     return true;
    }
}
