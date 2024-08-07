class Solution {
    public int maxProduct(int[] nums) {
        double beg=1,end=1,maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            if(beg==0)
                beg=1;
            if(end==0)
                end=1;
            beg=beg*nums[i];
            end=end*nums[nums.length-i-1];
            maxi=Math.max(maxi,(Math.max(beg,end)));
        }
        return (int)maxi;
    }
}
