package Day5;

public class LinkedlistCycle2_142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head==null)
            return null;
    
            if(head.next==null){
                return null;
            }
    
           
            ListNode slow=head,fast=head;
            boolean isLoopDetected=false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    isLoopDetected=true;
                }
            }
            if(isLoopDetected){
                slow=head;
                if(slow==fast){
                    return slow;
                }
                else{
                while(slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
                }
               return fast.next;
            }
        }
        return null;
    }
    }
}
