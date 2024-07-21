class Solution {
    public int calculate(String s) {
        int cur=0;
        char op='+';

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                cur=cur*10 + (c-'0');
            }
            
            if(!Character.isDigit(c) && c!=' '|| i==s.length()-1){
                if(op=='+'){
                    st.push(cur);
                }else if(op=='-'){
                    st.push(-cur);
                }else if(op=='*'){
                    st.push(st.pop()* cur);
                }else if(op=='/'){
                    st.push(st.pop()/ cur);
                }
                op=c;
                cur=0;
            }
        }

        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        } 

        return res;
    }
}
