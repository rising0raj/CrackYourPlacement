class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return helper(s,l+1,r) || helper(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean helper(String s,int l,int r){
        String st=s.substring(l,r+1);
        String re=new StringBuilder(st).reverse().toString();
        return st.equals(re);
    }
}
