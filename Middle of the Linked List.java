class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }
        return sp;
    }
}
