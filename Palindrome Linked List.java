class Solution {
    public ListNode reversethroughRecursevily(ListNode temp){
        if(temp==null || temp.next==null){
            return temp;
        }
        ListNode newhead=reversethroughRecursevily(temp.next);
        ListNode front=temp.next;
        front.next=temp;
        temp.next=null;

        return newhead;

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null){
            return true;
        }

        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newnode=reversethroughRecursevily(slow.next), first=head,second=newnode;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            second=second.next;
            first=first.next;
        }
        return true;
    }
}
