class Solution {
    public String convertToTitle(int col) {
        StringBuilder st=new StringBuilder();

        while(col>0){
            int r=(col-1)%26;
            st.append((char)(r+'A'));
            col=(col-1)/26;
        }
        return st.reverse().toString();
    }
}
