class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null ||lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode a:lists){
            if(a!=null){
                pq.offer(a);
            }
        }

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while(!pq.isEmpty()){
            ListNode s=pq.poll();
            temp.next=s;
            temp=temp.next;
            if(s.next!=null){
                pq.offer(s.next);
            }

        }

        return dummy.next;
    }
}
