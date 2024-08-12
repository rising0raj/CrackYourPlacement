class Solution {
    public int help(int []nums,int m){
        int sum=0,sp=1;
        for(int x:nums){
            if(sum+x<=m)    sum+=x;
            else{
                sp++;
                sum=x;
            }
        }
        return sp;
    }

    public int splitArray(int[] nums, int k) {
        int l=Integer.MIN_VALUE,r=0,m=0;

        for(int i:nums){
            l=Math.max(l,i);
            r+=i;
        }

        while(l<=r){
            m=(l+r)/2;
            int sp=help(nums,m);
            if(sp<=k) r=m-1;
            else    l=m+1;
        }

        return l;
    }
}
