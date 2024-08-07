class Solution {
    static ListNode getkthnode(ListNode temp, int k){
        k-=1;
        while(k>0&& temp!=null){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head, pre=null;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head, pre=null;
        while(temp!=null){
            ListNode kth=getkthnode(temp, k);
            if(kth==null){
                if(pre!=null){
                    pre.next=temp;
                }
                break;
            }

            ListNode nxt=kth.next;
            kth.next=null;
            reverse(temp);

            if(temp==head){
                head=kth;
            }else{
                pre.next=kth;
            }

            pre=temp;
            temp=nxt;
        }
        return head;
    }
}
