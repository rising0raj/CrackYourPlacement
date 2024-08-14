class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        int ans=0;
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1;
                    ans = Math.max(ans, dp[i+1][j+1]);
                }
            }
        }
        return ans;
    }
}
