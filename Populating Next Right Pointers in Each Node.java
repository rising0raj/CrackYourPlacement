class Solution {
    public Node connect(Node root) {
        Node black=root;

        while(black!=null && black.left!=null){
            Node n=black;
            while(true){
                n.left.next=n.right;
                if(n.next==null)    break;
                n.right.next=n.next.left;
                n=n.next;
            }
            black=black.left;
        }

        return root;        
    }
}
