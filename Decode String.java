class Solution {
    public String decodeString(String s) {
        Stack <Integer> num=new Stack<>();
        Stack <StringBuilder> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        int n=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }else if(ch=='['){
                num.push(n);
                n=0;
                st.push(str);
                str=new StringBuilder();
            }else if(ch==']'){
                int k=num.pop();
                StringBuilder temp=str;
                str=st.pop();
                while(k-->0){
                    str.append(temp);
                }
            }else{
                str.append(ch);
            }
        }

        return str.toString();
    }
}
