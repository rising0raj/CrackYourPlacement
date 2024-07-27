class Solution {
    public Node subLinkedList(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);
        
        if (len1 < len2) {
            head1 = padList(head1, len2 - len1);
        } else if (len2 < len1) {
            head2 = padList(head2, len1 - len2);
        }
        
        BigInteger num1 = linkedListToBigInteger(head1);
        BigInteger num2 = linkedListToBigInteger(head2);
        BigInteger result = num1.subtract(num2).abs();
        
        return bigIntegerToLinkedList(result);
    }

    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private Node padList(Node head, int padding) {
        Node dummy = new Node(0);
        Node current = dummy;
        for (int i = 0; i < padding; i++) {
            current.next = new Node(0);
            current = current.next;
        }
        current.next = head;
        return dummy.next;
    }

    private BigInteger linkedListToBigInteger(Node head) {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
        }
        return new BigInteger(sb.toString());
    }

    private Node bigIntegerToLinkedList(BigInteger bigInt) {
        String str = bigInt.toString();
        Node head = new Node(Character.getNumericValue(str.charAt(0)));
        Node current = head;
        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(Character.getNumericValue(str.charAt(i)));
            current = current.next;
        }
        return head;
    }
}
