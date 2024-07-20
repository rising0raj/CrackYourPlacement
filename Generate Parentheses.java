class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(0,0,"",n,ans);
        return ans;
        
    }

    private void generate(int open , int close, String curr, int n, List<String> ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open<n){
            generate(open+1, close,curr+"(", n , ans);
        }
        if(close<open){
            generate(open, close+1,curr+")", n , ans);
        }
    }
}
