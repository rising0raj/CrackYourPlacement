class Solution {
    public int nthUglyNumber(int n) {
        int ugly=0,i2=0,i3=0,i5=0,nums[]=new int[n];
        nums[0]=1;
        for(int i=1;i<n;i++){
        ugly = Math.min(Math.min(nums[i2]*2,nums[i3]*3),nums[i5]*5);
        nums[i] = ugly;

        if(ugly == nums[i2]*2) ++i2;
        if(ugly == nums[i3]*3) ++i3;
        if(ugly == nums[i5]*5) ++i5;
        
    }

    return nums[n-1];
    }
}
