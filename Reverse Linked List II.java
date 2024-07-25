
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        if(left == right) return head;
        int count = 1;
        while(count <= right){
            if(count >= left){
                arr.add(temp.val);
            }
            temp = temp.next;
            count++;
        }
        Collections.reverse(arr);
        count = 1;
        temp = head;
        int i = 0;
        while(count <= right){
            if(count >= left){
                temp.val = arr.get(i);
                i++;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}
