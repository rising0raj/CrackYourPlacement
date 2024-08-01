class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";

        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();

        int i = 0;

        while(i < num.length()){
            
            while(k > 0 && st.size() > 0 &&  st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
            i++;
        }

        while (k > 0 && st.size() > 0){st.pop(); k--;}
        while(st.size() > 0) str.append(st.pop());
        str.reverse();
        while (str.toString().startsWith("0")) str.deleteCharAt(0);

        return str.length() == 0 ? "0" : str.toString();
        
    }
}
