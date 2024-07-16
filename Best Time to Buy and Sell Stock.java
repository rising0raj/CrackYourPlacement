class Solution {
    public int maxProfit(int[] p) {
        int mini=p[0],profit=0,diff=0;
        for(int i=1;i<p.length;i++){
            diff=p[i]-mini;
            profit=Math.max(profit,diff);
            mini=Math.min(mini,p[i]);
        }
        return profit;
    }
}
