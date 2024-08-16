class Solution {
    public int trap(int[] height) {
        int res=0, maxl=0,maxr=0,l=0,r=height.length-1;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>maxl)
                    maxl=height[l];
                else
                    res+=maxl-height[l];
                l++;
            }else{
                if(height[r]>maxr)
                    maxr=height[r];
                else
                    res+=maxr-height[r];
                r--;
            }
        }

        return res;
    }
}
