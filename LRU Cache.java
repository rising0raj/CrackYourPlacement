class LRUCache {
    Node head=new Node(0,0),tail=new Node(0,0);
    Map<Integer,Node> map=new HashMap<>();
    int capacity;

    public LRUCache(int _capacity) {
        capacity=_capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));

    }

    public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insert(Node node){
        map.put(node.key, node);
        Node headnext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headnext;
        headnext.prev=node;
        
    }

    class Node {
        Node prev, next;
        int val, key;
        Node(int _key, int _val){
            key=_key;
            val=_val;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
