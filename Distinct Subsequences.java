class Solution {
    static int prime = (int) (Math.pow(10, 9) + 7);
    public int help(String s, String t,int sl, int tl,int dp[][]){
        if(tl<0){
            return 1;
        }
        if(sl<0){
            return 0;
        }

        if(dp[sl][tl]!=-1){
            return dp[sl][tl];
        }
        
        if(s.charAt(sl) == t.charAt(tl)){
            int leave=help(s,t,sl-1,tl-1,dp);
            int stay=help(s,t,sl-1,tl,dp);

            return dp[sl][tl]=(leave+stay)%prime;
        }
        
            return dp[sl][tl]=help(s,t,sl-1,tl,dp);
        

    }
    public int numDistinct(String s, String t) {

        int lt=s.length(), ls=t.length();
        int dp[][] = new int[lt][ls];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        return help(s, t, lt - 1, ls - 1, dp);
    }
}
