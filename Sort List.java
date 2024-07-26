class Solution {
    static ListNode middle(ListNode head){
        ListNode fast=head.next,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static ListNode merge(ListNode left, ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(left!=null && right !=null){
            if(left.val>right.val){
                temp.next=right;
                temp=right;
                right=right.next;
            }else{
                temp.next=left;
                temp=left;
                left=left.next;
            }
        }
        if(left!=null){
            temp.next=left;
        }else{
            temp.next=right;
        }

        return dummy.next;

    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=middle(head),left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(head);
        right=sortList(right);
        return merge(left,right);
    }
}
