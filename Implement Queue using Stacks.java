class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        this.s1=new Stack<>();
        this.s2=new Stack<>();  
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop(); 
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty())
        return true;
        return false;
    }
}
