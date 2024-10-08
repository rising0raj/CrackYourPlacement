public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
    ListNode b = headB;
    
    while(a != b){
        if(a == null){
            a = headA;
        }
        else{
            a = a.next;
        }
        
        if(b == null){
            b = headB;
        }
        else{
            b = b.next;
        }
    }
    return a;
    }
}
