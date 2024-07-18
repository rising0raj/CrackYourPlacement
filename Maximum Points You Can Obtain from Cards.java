class Solution {
    public int maxScore(int[] c, int k) {
        int l=0,ans=0,r=0,n=c.length-1;

        for(int i=0;i<k;i++){
            l+=c[i];
        }

        ans=l;

        for(int i=k-1;i>=0;i--){
            l-=c[i];
            r+=c[n--];
            ans=Math.max(ans,l+r);
        }
        return ans;
    }
}
