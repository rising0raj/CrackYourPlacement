class Solution
{
    Node compute(Node temp)
    {
         if(temp.next==null){
            return temp;
        }
        Node connect=compute(temp.next);
        
        if(temp.data>=connect.data){
            temp.next=connect;
            return temp;
        }
        
        return connect;
    }
}
